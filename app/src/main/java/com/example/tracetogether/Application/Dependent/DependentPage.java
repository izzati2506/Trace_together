package com.example.tracetogether.Application.Dependent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tracetogether.R;

public class DependentPage extends AppCompatActivity {

    ImageView edit_depen;
    Button Add_new_Depen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dependent_page);

        edit_depen =(ImageView) findViewById(R.id.edit_depen);
        Add_new_Depen =(Button) findViewById(R.id.Add_new_Depen);

        // this Listener to get to Dependet Details page
        edit_depen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DependentPage.this, Dependent_Details.class));
            }
        });

        // this listener to get to Add dependent page
        Add_new_Depen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DependentPage.this, Add_Dependent.class));
            }
        });
    }


    // this Intent to get to Dependet Details  page
    public void openDependent_Details() {
        Intent intent3 = new Intent(DependentPage.this, Dependent_Details.class);
        startActivity(intent3);
    }

    // this Intent to get to Add_Dependent  page
    public void openAdd_Dependent() {
        Intent intent3 = new Intent(DependentPage.this, Add_Dependent.class);
        startActivity(intent3);
    }
}

