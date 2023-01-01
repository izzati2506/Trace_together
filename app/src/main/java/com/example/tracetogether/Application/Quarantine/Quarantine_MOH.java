package com.example.tracetogether.Application.Quarantine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.tracetogether.R;
public class Quarantine_MOH extends AppCompatActivity {

    CardView cardStatus;
    CardView cardRecord;
    CardView cardTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine_moh);

        cardStatus= findViewById(R.id.moh_viewstatus);
        cardRecord= findViewById(R.id.moh_viewrecord);
        cardTest= findViewById(R.id.moh_viewtest);

        cardStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quarantine_MOH.this,Quarantine_MOH_CovidStatus.class));
            }
        });

        cardRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quarantine_MOH.this,Quarantine_MOH_quarantinerecord.class));
            }
        });

        cardTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quarantine_MOH.this,Quarantine_MOH_selftest.class));
            }
        });
    }
}