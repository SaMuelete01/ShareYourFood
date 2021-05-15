package com.example.shareyourfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    private Button signUp;
    private EditText username, password, password2;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        signUp = (Button) findViewById(R.id.signup);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = ((EditText) findViewById (R.id.username1));
                password = ((EditText) findViewById (R.id.password1));
                password2 = ((EditText) findViewById (R.id.password2));

                if (password.equals(password2)) {
                    if (true /* comprobar si ese usuario y contraseña existen*/) {
                        username.setError("This account already exists");
                    } else {
                        // Si no son datos repetidos se registra la nueva cuenta
                        toast = Toast.makeText(getApplicationContext(), "user registered correctly", Toast.LENGTH_SHORT);
                        toast.show();
                        //startActivity(new Intent(SignIn.this, InicioApp.class);
                    }
                } else
                    password2.setError("the passwords must be equals");
            }
        });
    }
}