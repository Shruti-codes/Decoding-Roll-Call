package com.example.decodingrollcall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etRoll;
    TextView tvEnter,tvResult;
    Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        etRoll = findViewById ( R.id.etRoll);
        tvEnter = findViewById ( R.id.tvEnter );
        btnDone = findViewById ( R.id.btnDone );
        tvResult = findViewById ( R.id.tvResult );

        tvResult.setVisibility ( View.GONE );

        btnDone.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if (etRoll.getText ().toString ().isEmpty ())
                    Toast.makeText ( MainActivity.this, "Please enter valid data", Toast.LENGTH_SHORT ).show ();

                else {

                    String roll = etRoll.getText ().toString ().trim (); //trim() takes away all the spaces and whitespaces
                    String branch = roll.substring ( 3, 6 );
                    int actualRoll = Integer.parseInt ( roll.substring ( 7, 12 ) );
                    int Regis = Integer.parseInt ( roll.substring ( 13, 16 ) );

                    tvResult.setVisibility ( View.VISIBLE );

                    tvResult.setText ( "Branch = " + branch + "\n" + "Roll No. = " + actualRoll + "\n" + "Registration No. = " + Regis );

                }
            }
        } );

    }
}
