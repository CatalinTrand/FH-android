package com.example.tudor.food_hunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OfferListActivity extends AppCompatActivity {
    Button newOffer_Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_list);

        newOffer_Btn = findViewById(R.id.offerlist_new_offer_btn);

        newOffer_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),NewOfferActivity.class);
                startActivity(i);
            }
        });
    }
}
