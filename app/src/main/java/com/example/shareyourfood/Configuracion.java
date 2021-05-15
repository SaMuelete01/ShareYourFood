package com.example.shareyourfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.util.List;

public class Configuracion extends AppCompatActivity {
    //TODO Si añades usuarios a la lista se peta y no furula
    List<Usuario> userList;
    Usuario user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        Usuario user1 = new Usuario("Sa1", "holaxd",
                new File("D:\\GitHub\\Share-Your-Food\\ShareYourFood\\app\\src\\main\\res\\drawable-v24\\avatar.png"));
        Usuario user2 = new Usuario("Esto es una prueba", "holaxd",
                new File("D:\\GitHub\\Share-Your-Food\\ShareYourFood\\app\\src\\main\\res\\drawable-v24\\avatar.png"));
        //userList.add(user1);
        //userList.add(user2);

        user = new Usuario("SaMuelete01", "holaxd",
                new File("D:\\GitHub\\Share-Your-Food\\ShareYourFood\\app\\src\\main\\res\\drawable-v24\\avatar.png"));
        EditText username = (EditText) findViewById(R.id.userEdit);
        username.setText(user.getUsername());
        //iconito en verde espectacular de usuario disp
        Button save = (Button)findViewById(R.id.saveButton);
        Button cancel = (Button)findViewById(R.id.cancelButton);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usuarioDisp(username.getText().toString())){
                    user.setUsername(username.getText().toString());
                    //guardar contraseñas
                    Intent intent = new Intent(Configuracion.this, Profile.class);
                    startActivity(intent);
                }
                else{
                    username.setError("EL nombre de usuario no se encuentra disponible");
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Configuracion.this, Profile.class);
                startActivity(intent);
            }
        });
    }

    private boolean usuarioDisp(String usuario){
        if(usuario.equals(user)){
            return true;
        }
        else{
            for(Usuario u : userList){
                if(u.getUsername().equals(usuario)) return false;
            }
            return true;
        }
    }
}