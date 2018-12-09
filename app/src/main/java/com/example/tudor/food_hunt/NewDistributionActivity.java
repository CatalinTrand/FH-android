package com.example.tudor.food_hunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewDistributionActivity extends AppCompatActivity {
    Button sendDistribution_Btn;
    EditText details_Input, location_Input, quantity_Input, time_Input, date_Input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_distribution);

        sendDistribution_Btn = findViewById(R.id.newdstr_send_dstr_btn);
        details_Input = findViewById(R.id.newdstr_details_inp);
        location_Input = findViewById(R.id.newdstr_location_inp);
        quantity_Input = findViewById(R.id.newdstr_quantity_inp);
        time_Input = findViewById(R.id.newdstr_time_inp);
        date_Input = findViewById(R.id.newdstr_date_inp);

        sendDistribution_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),DistributeListActivity.class);
                startActivity(i);
            }
        });
    }
}
