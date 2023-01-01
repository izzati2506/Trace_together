package com.example.tracetogether.Application.Quarantine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*To declare the card view button*/
import com.example.tracetogether.R;
public class Quarantine_User extends AppCompatActivity {
CardView cardViewRecord, cardViewStatus, cardViewTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine_user);
        cardViewRecord= findViewById(R.id.quarantinerecord);
        cardViewStatus= findViewById(R.id.covidstatus);
        cardViewTest= findViewById(R.id.selftest);

        /*direct card to the next page*/
        cardViewRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quarantine_User.this, Quarantine_User_Record.class));
            }
        });

        cardViewStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quarantine_User.this, Quarantine_User_Covid19status.class));
            }
        });

        cardViewTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quarantine_User.this, Quarantine_User_updateselftest.class));
            }
        });

        }


    }
