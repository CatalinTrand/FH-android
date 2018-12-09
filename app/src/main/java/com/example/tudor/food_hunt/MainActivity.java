package com.example.tudor.food_hunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button order_Btn, distribute_Btn, offer_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        order_Btn =findViewById(R.id.main_order_btn);
        distribute_Btn =findViewById(R.id.main_distribute_btn);
        offer_Btn = findViewById(R.id.main_offer_btn);

        offer_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),LogInActivity.class);
                startActivity(i);
            }
        });

        distribute_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),LogInActivity.class);
                startActivity(i);
            }
        });
        order_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),UserActivity.class);
                startActivity(i);
            }
        });
    }
}
