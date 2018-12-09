package com.example.tudor.food_hunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccountActivity extends AppCompatActivity {
    Button register_Btn;
    EditText email_Input, password_Input, confirm_password_Input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        email_Input = findViewById(R.id.create_email_input);
        password_Input = findViewById(R.id.create_passwd_input);
        confirm_password_Input = findViewById(R.id.create_conf_passwd_input);
        register_Btn = findViewById(R.id.create_register_btn);


        register_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),LogInActivity.class);
                startActivity(i);
            }
        });
    }
}
