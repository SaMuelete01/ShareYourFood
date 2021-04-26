package com.example.shareyourfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class  SignIn extends AppCompatActivity {
    Button signIn;
    Button signUp;
    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        signIn = (Button) findViewById(R.id.signin);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this, Profile.class);
                startActivity(intent);
                /*username = ((EditText) findViewById (R.id.username1)).getText().toString();
                password = ((EditText) findViewById (R.id.password1)).getText().toString();
                if (true /*exists(username, password)) {
                    //Intent intent = new Intent(SignIn.this, InicioApp.class);
                   // startActivity(intent);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Wrong data", Toast.LENGTH_SHORT);
                    toast.show();
                }*/
            };
        });

        signUp = (Button) findViewById(R.id.signup);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this, SignUp.class);
                startActivity(intent);
            }
        });
    };
}