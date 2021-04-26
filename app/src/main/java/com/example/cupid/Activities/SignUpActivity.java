package com.example.cupid.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cupid.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

public class SignUpActivity extends AppCompatActivity {
    Button Have_Account;
    Button SignUp;
    TextView dob;
    DatePickerDialog datePickerDialog;


    RadioGroup radioGroup;
    RadioButton radioButton;
    TextInputEditText full_name, username, email, phone, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Have_Account = findViewById(R.id.Have_Account);
        SignUp = findViewById(R.id.signup);

        full_name = findViewById(R.id.full_name);
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);


        dob = findViewById(R.id.dob);
//        dob_layout=findViewById(R.id.dob_layout);
        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                datePickerDialog = new DatePickerDialog(SignUpActivity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                dob.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();

            }
        });

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname, usernam, emailadress, phonenum, pass;
                fullname = full_name.getText().toString().trim();
                usernam = username.getText().toString().trim();
                emailadress = email.getText().toString().trim();
                phonenum = phone.getText().toString().trim();
                pass = password.getText().toString();

                if (fullname.isEmpty()) {
                    full_name.setError("Name required");
                    return;
                } else if (usernam.isEmpty()) {
                    username.setError("Username required");
                    return;
                } else if (emailadress.isEmpty()) {
                    email.setError("Email required");
                    return;
                } else if (phonenum.isEmpty()) {
                    phone.setError("Phone required");
                    return;
                } else if (pass.isEmpty()) {
                    password.setError("Password required");
                    return;
                } else {


                    Intent i = new Intent(SignUpActivity.this, SignupSuccessfullActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });
        Have_Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(in);
                finish();
            }
        });

    }
}