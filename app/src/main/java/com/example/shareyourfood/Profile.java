package com.example.shareyourfood;

import android.graphics.drawable.Icon;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.File;

public class Profile extends AppCompatActivity {
    private String nick;
    private int foto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());

        Usuario user = new Usuario("SaMuelete01", "holaxd", new File("D:\\GitHub\\Share-Yout-Food\\ShareYourFood\\app\\src\\main\\res\\drawable-v24\\avatar.png"));
        TextView nick = (TextView) findViewById(R.id.nick);
        nick.setText(user.getUsername());
        ImageView avatar = (ImageView) findViewById(R.id.avatar);
        avatar = user.getFoto();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.config);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Aqui se abriria el menu de configuracion", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}