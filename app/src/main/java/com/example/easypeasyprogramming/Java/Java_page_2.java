package com.example.easypeasyprogramming.Java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.easypeasyprogramming.CPP.CPP_page_2;
import com.example.easypeasyprogramming.CPP.CPP_page_3E;
import com.example.easypeasyprogramming.R;

public class Java_page_2 extends AppCompatActivity {

    Button javaEnglish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_page_2);

        javaEnglish = (Button) findViewById(R.id.btn_javaEnglish);

        javaEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Java_page_2.this, Java_page_3E.class);
                startActivity(i1);

            }
        });



    }
}
