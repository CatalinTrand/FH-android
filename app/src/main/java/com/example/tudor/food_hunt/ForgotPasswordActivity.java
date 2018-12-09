package com.example.tudor.food_hunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgotPasswordActivity extends AppCompatActivity {
    Button reset_passwd_Btn;
    EditText email_Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        email_Input = findViewById(R.id.forgot_email_input);
        reset_passwd_Btn = findViewById(R.id.forgot_reset_btn);

        reset_passwd_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),LogInActivity.class);
                startActivity(i);
            }
        });
    }
}
