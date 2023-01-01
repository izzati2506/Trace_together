package com.example.tracetogether.Application.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tracetogether.Application.Homepage.Admin_Homepage;
import com.example.tracetogether.Application.Homepage.MOH_Homepage;
import com.example.tracetogether.Application.Homepage.User_Homepage;
import com.example.tracetogether.Application.Registration.Registration_1;
import com.example.tracetogether.R;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {
    EditText phoneNo, password;
    Button btn_login, btn_register;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        btn_register =(Button) findViewById(R.id.btn_register);
        phoneNo=(EditText) findViewById(R.id.phoneNo);
        password=(EditText) findViewById(R.id.password);
        btn_login=(Button) findViewById(R.id.btn_login);
        spinner=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.usertype, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        btn_login.setOnClickListener(new View.OnClickListener() {

            // this is for using spinner for usertype
            @Override
            public void onClick(View v) {

//                String item = spinner.getSelectedItem().toString();

                if(phoneNo.getText().toString().equals("0123334444") && password.getText().toString().equals("user") && spinner.getSelectedItem().toString().equals("user")){
                    startActivity(new Intent(Login.this, User_Homepage.class));
                }
                else if(phoneNo.getText().toString().equals("0123334444") && password.getText().toString().equals("admin") && spinner.getSelectedItem().toString().equals("admin")){
                    startActivity(new Intent(Login.this, Admin_Homepage.class));
                }
                else if(phoneNo.getText().toString().equals("0123334444") && password.getText().toString().equals("moh") && spinner.getSelectedItem().toString().equals("MOH-User")){
                    startActivity(new Intent(Login.this, MOH_Homepage.class));
                }
                else {
                    Toast.makeText(getApplicationContext(),"(Please select userType)",Toast.LENGTH_LONG).show();
                }
            }
        });

        // Registration button to get to registration page
        btn_register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, Registration_1.class));
            }

        });
    }
}


