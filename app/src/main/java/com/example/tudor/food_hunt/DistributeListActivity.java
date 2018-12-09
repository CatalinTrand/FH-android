package com.example.tudor.food_hunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DistributeListActivity extends AppCompatActivity {
    Button newDstr_Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distribute_list);

        newDstr_Btn = findViewById(R.id.dstrlist_new_dstr_btn);

        newDstr_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),NewDistributionActivity.class);
                startActivity(i);
            }
        });
    }
}
