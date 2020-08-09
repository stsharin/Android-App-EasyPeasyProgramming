package com.example.easypeasyprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnBooks, btnTutorials, btnVideo, btnIDE, btnSites, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


///////////////////////////////////////////////////buttons///////////////////////////////////////////////////////////////////////////
        btnBooks = (Button) findViewById(R.id.btn_book);
        btnTutorials = (Button) findViewById(R.id.btn_tutorials);
        btnVideo = (Button) findViewById(R.id.btn_video);
        btnIDE = (Button) findViewById(R.id.btn_ide);
        btnSites = (Button) findViewById(R.id.btn_sites);
        btnAbout = (Button) findViewById(R.id.btn_about);

        btnBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this, Book.class);
                startActivity(i1);
            }
        });

        btnTutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this, Tutorial.class);
                startActivity(i2);
            }
        });

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(MainActivity.this, Video.class);
                startActivity(i3);
            }
        });

        btnIDE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(MainActivity.this, IDE.class);
                startActivity(i4);
            }
        });

        btnSites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(MainActivity.this, Sites.class);
                startActivity(i5);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(MainActivity.this, About.class);
                startActivity(i6);
            }
        });

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    }
}
