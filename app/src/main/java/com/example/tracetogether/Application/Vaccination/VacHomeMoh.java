package com.example.tracetogether.Application.Vaccination;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tracetogether.R;

public class VacHomeMoh extends AppCompatActivity {

    CardView cvAdd, cvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vac_home_moh);

        cvAdd = findViewById(R.id.cv1);
        cvView = findViewById(R.id.cv2);

        //link to next page
        cvAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VacHomeMoh.this, MohAddAppt.class));
            }
        });

        // link to next page
        cvView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VacHomeMoh.this, MohViewAppt.class));
            }
        });
    }
}