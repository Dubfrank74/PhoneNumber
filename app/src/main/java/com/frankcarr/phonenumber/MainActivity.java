package com.frankcarr.phonenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private EditText phonenumber;
    private Button clear, validate;
    private String PhoneString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.tvDisplay);
        phonenumber = findViewById(R.id.etPhoneNo);
        clear = findViewById(R.id.btnClear);
        validate = findViewById(R.id.btnValidate);







    }

    public void validate(View view) {


        PhoneString = phonenumber.getText().toString();
        Intent Validate = new Intent(view.getContext(), NumberValidation.class);
        Validate.putExtra("PhoneNo", PhoneString);
        startActivity(Validate);

    }

    public void clear(View view) {
        phonenumber.getText().clear();
    }
}
