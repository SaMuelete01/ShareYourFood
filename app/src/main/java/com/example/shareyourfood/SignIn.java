package com.example.shareyourfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    private Button signIn;
    private Button signUp;
    private EditText username;
    private EditText password;
    private Toast toast;

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
                username = ((EditText) findViewById (R.id.username1));
                password = ((EditText) findViewById (R.id.password1));
                if (true /*comprobar si ese usuario y contraseña existen*/) {
                   // startActivity(new Intent(SignIn.this, InicioApp.class);
                } else {
                    toast = Toast.makeText(getApplicationContext(), "Wrong Data", Toast.LENGTH_SHORT);
                    toast.show();
                }
            };
        });

        signUp = (Button) findViewById(R.id.signup);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignIn.this, SignUp.class));
            }
        });
    };
}