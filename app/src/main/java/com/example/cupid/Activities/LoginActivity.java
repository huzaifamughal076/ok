package com.example.cupid.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cupid.R;

public class LoginActivity extends AppCompatActivity {

    EditText password,username;
    CheckBox checkBox;
    TextView click_here;
    ImageView img;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        img = findViewById(R.id.logocup);
        password = findViewById(R.id.password);
        username = findViewById(R.id.username);
        checkBox = findViewById(R.id.showpass);
        click_here = findViewById(R.id.move_to_signup);
        Login=findViewById(R.id.login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this,HomeScreen.class);
                startActivity(i);
                finish();
            }
        });


        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked())
                {
                    password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else
                {
                    password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        click_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it= new Intent(getApplicationContext(),SignUpActivity.class);


                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    Pair[] pairs = new Pair[1];
                    pairs[0]=new Pair<View,String>(img,"ok");
                    ActivityOptions anim= ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this,pairs);
                    startActivity(it, anim.toBundle());
                    finish();
                }
            }
        });
    }
}