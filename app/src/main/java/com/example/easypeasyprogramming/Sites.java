package com.example.easypeasyprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sites extends AppCompatActivity {

    TextView st, gg, qr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sites);

        st = findViewById(R.id.tv_stackoverflow);
        gg = findViewById(R.id.tv_greek);
        qr = findViewById(R.id.tv_quora);

        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://stackoverflow.com/"));
                startActivity(i1);
            }
        });

        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geeksforgeeks.org/"));
                startActivity(i2);
            }
        });

        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.quora.com/"));
                startActivity(i3);
            }
        });
    }
}
