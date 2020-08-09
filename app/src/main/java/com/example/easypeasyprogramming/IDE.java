package com.example.easypeasyprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IDE extends AppCompatActivity {

    TextView cd, ec, py, it, sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ide);

        cd = findViewById(R.id.tv_codeblocks);
        ec = findViewById(R.id.tv_eclipse);
        py = findViewById(R.id.tv_pycharm);
        it = findViewById(R.id.tv_intellij);
        sb = findViewById(R.id.tv_sublime);

        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.codeblocks.org/downloads/binaries"));
                startActivity(i1);
            }
        });

        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eclipse.org/downloads/packages/release/kepler/sr1/eclipse-ide-java-developers"));
                startActivity(i2);
            }
        });

        py.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jetbrains.com/pycharm/download/#section=windows"));
                startActivity(i3);
            }
        });

        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jetbrains.com/idea/download/#section=windows"));
                startActivity(i4);
            }
        });

        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sublimetext.com/3"));
                startActivity(i5);
            }
        });
    }
}
