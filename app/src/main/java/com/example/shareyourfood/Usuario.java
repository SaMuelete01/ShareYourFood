package com.example.shareyourfood;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.io.File;

public class Usuario {
    private String username;
    private String password;
    private ImageView foto;

    public Usuario(String username, String password, File foto){
        this.username=username;
        this.password=password;
        Bitmap myBitmap = BitmapFactory.decodeFile(foto.getAbsolutePath());
        this.foto.setImageBitmap(myBitmap);
    }

    public String getUsername(){
        return username;
    }
    public String getUPassword(){
        return password;
    }
    public ImageView getFoto(){
        return foto;
    }
}
