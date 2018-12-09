package com.example.tudor.food_hunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewOfferActivity extends AppCompatActivity {
    Button sendOffer_Btn;
    EditText description_Input, location_Input, quantity_Input, time_Input, date_Input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_offer);


        sendOffer_Btn = findViewById(R.id.newoffer_send_offer_btn);
        description_Input = findViewById(R.id.newoffer_desc_inp);
        location_Input = findViewById(R.id.newoffer_location_inp);
        quantity_Input = findViewById(R.id.newoffer_quantity_inp);
        time_Input = findViewById(R.id.newoffer_time_inp);
        date_Input = findViewById(R.id.newoffer_date_inp);

        sendOffer_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),OfferListActivity.class);
                startActivity(i);
            }
        });
    }
}
