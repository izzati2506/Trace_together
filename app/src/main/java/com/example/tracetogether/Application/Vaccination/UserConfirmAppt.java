package com.example.tracetogether.Application.Vaccination;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tracetogether.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserConfirmAppt extends AppCompatActivity {

    TextView name, ic, phoneNo;
    CheckBox consent;
    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_confirm_appt);

        name = findViewById(R.id.tvName);
        ic = findViewById(R.id.tvIc);
        phoneNo = findViewById(R.id.tvPhone);
        consent = findViewById(R.id.cbConsent);
        btnConfirm = findViewById(R.id.btnCon);

        // on button confirm click, toast message
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(consent.isChecked()) {
                    Toast.makeText(UserConfirmAppt.this, "Consent approved", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(UserConfirmAppt.this, UserBookSlot.class));
                }
                else {
                    Toast.makeText(UserConfirmAppt.this, "Consent not approved", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}