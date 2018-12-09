package com.example.tudor.food_hunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {

    Button auth_Btn, frgt_passwd_Btn, create_acc_Btn;
    EditText email_Input, passwd_Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        auth_Btn = findViewById(R.id.login_auth_btn);
        frgt_passwd_Btn = findViewById(R.id.login_frgt_passwd_btn);
        create_acc_Btn = findViewById(R.id.login_create_acc_btn);
        email_Input = findViewById(R.id.login_email_input);
        passwd_Input = findViewById(R.id.login_password_input);

        frgt_passwd_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),ForgotPasswordActivity.class);
                startActivity(i);
            }
        });

        create_acc_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),CreateAccountActivity.class);
                startActivity(i);
            }
        });

        auth_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email_Input.getText().toString().equals("offer")){
                    Intent i = new Intent(getBaseContext(),OfferListActivity.class);
                    startActivity(i);
                }
                if(email_Input.getText().toString().equals("distribute")){
                    Intent i = new Intent(getBaseContext(),DistributeListActivity.class);
                    startActivity(i);
                }

            }
        });

    }
}
