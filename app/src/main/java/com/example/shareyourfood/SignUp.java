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
    Button signUp;
    private String username;
    private String password, password2;
    private EditText txtpassword;
    Toast toast;
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
                username = ((EditText) findViewById (R.id.username1)).getText().toString();
                password = ((EditText) findViewById (R.id.changePass1)).getText().toString();
                txtpassword = ((EditText) findViewById (R.id.changePass1));
                password2 = ((EditText) findViewById (R.id.password2)).getText().toString();
                if (password.equals(password2)) {
                    if (true /*exists(username, password)*/) {
                        userExistsMessage();
                        Intent intent = new Intent(SignUp.this, SignIn.class);
                        startActivity(intent);
                    } else {
                        userRegistered();
                        //Intent intent = new Intent(SignIn.this, InicioApp.class);
                        //startActivity(intent);
                    }
                } else {
                    txtpassword.setError("hola");
                    //passwordMessage();
                }
            }
        });
    }

    public void passwordMessage(){
        toast = Toast.makeText(getApplicationContext(),"the passwords must be equals", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void userExistsMessage(){
        toast = Toast.makeText(getApplicationContext(),"this account already exists, sign in", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void userRegistered(){
        toast = Toast.makeText(getApplicationContext(), "user registered correctly", Toast.LENGTH_SHORT);
        toast.show();
    }
}