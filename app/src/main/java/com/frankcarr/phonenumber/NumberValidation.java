package com.frankcarr.phonenumber;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NumberValidation extends AppCompatActivity {

    TextView number;
    Button valid, invalid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_validation);
        number = findViewById(R.id.tvDisplay2);
        valid = findViewById(R.id.btnvalid);
        invalid = findViewById(R.id.btninvalid);


        String PassedNumber = getIntent().getStringExtra("PhoneNo");

        number.setText((String.valueOf(PassedNumber)));

        if(PassedNumber.matches ("08[345678]\\d{7}|\\+353 8[34567]\\d{7}|00 353 8[34567]\\d{7}")) {
            valid.setVisibility(View.VISIBLE);
        }
        else{
                invalid.setVisibility(View.VISIBLE);
            }
        }



    public void MainActivity(View view) {
        finish();
    }
}
