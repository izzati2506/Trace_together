package com.example.tracetogether.Application.Vaccination;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.tracetogether.R;
import com.google.firebase.database.FirebaseDatabase;

public class UserApptPage extends AppCompatActivity {

    TextView viewAppt, editAppt, cancelAppt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_appt_page);

        viewAppt = findViewById(R.id.tvViewAppt);
        editAppt = findViewById(R.id.tvEditAppt);
        cancelAppt = findViewById(R.id.tvCancelAppt);

        // on button click, go to next activity
        viewAppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserApptPage.this, UserViewAppt.class));
            }
        });

        // on button click, go to next activity
        editAppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserApptPage.this, UserEditAppt.class));
            }
        });

        cancelAppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(UserApptPage.this)
                        .setTitle("Cancel Appointment")
                        .setMessage("Are you sure you want to cancel appointment?")
                        //dialog automatically dismissed when a dialog button is clicked
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // delete operation
                            }
                        })

                        //null listener allows the button to dismiss the dialog and take no further action
                        .setNegativeButton(android.R.string.no, null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }
        });
    }
}