package com.example.tracetogether.Application.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tracetogether.R;

public class User_Profile extends AppCompatActivity {
    Spinner spinner;
ImageView UserProfile_img,TGR_ID_page , language_img_pag,Chagne_password_imag ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);

        UserProfile_img=(ImageView) findViewById(R.id.UserProfile_img);
        TGR_ID_page=(ImageView) findViewById(R.id.TGR_ID_page);
        language_img_pag=(ImageView) findViewById(R.id.language_img_pag);
        Chagne_password_imag=(ImageView) findViewById(R.id.Chagne_password_imag);

        // this listener to get to User Details page
        UserProfile_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User_Profile.this, User_Details.class));
            }

        });
        // this listener to get to ChangeID page
        TGR_ID_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User_Profile.this, ChangeID_page.class));
            }

        });
        // this listener to get to Change language page
        language_img_pag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User_Profile.this, Change_Language.class));
            }

        });
        // this listener to get to Change Password page
        Chagne_password_imag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User_Profile.this, Change_Password.class));
            }

        });


    }
    // this Intent to get to User Details page
    public void openUserProfile() {

        Intent intent3 = new Intent(User_Profile.this, User_Details.class);
        startActivity(intent3);
    }
    // this Intent to get to ChangeID  page
    public void openChangeID_page() {
        Intent intent3 = new Intent(User_Profile.this, ChangeID_page.class);
        startActivity(intent3);
    }
    // this Intent to get to Change language  page
    public void openChange_Language() {
        Intent intent3 = new Intent(User_Profile.this, Change_Language.class);
        startActivity(intent3);
    }
    // this Intent to get to Change_Password page
    public void openChange_Password() {
        Intent intent3 = new Intent(User_Profile.this, Change_Password.class);
        startActivity(intent3);
    }


}



