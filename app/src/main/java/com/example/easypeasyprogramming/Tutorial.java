package com.example.easypeasyprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tutorial extends AppCompatActivity {

    TextView tp, jtp, w3, pg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        tp = findViewById(R.id.tv_tutorialsPoint);
        jtp = findViewById(R.id.tv_javatpoint);
        w3 = findViewById(R.id.tv_w3);
        pg = findViewById(R.id.tv_programiz);

        tp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/index.htm"));
                startActivity(i1);
            }
        });

        jtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/"));
                startActivity(i2);
            }
        });

        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com/"));
                startActivity(i3);
            }
        });

        pg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/"));
                startActivity(i4);
            }
        });
    }
}
