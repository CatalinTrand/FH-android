package com.example.tudor.food_hunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {
    Button gotoMap_Btn, achievements_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        gotoMap_Btn = findViewById(R.id.user_tomap_btn);
        achievements_Btn = findViewById(R.id.user_achievements_btn);

        achievements_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),AchievementsActivity.class);
                startActivity(i);
            }
        });

        gotoMap_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),MapsActivity.class);
                startActivity(i);
            }
        });

    }
}
