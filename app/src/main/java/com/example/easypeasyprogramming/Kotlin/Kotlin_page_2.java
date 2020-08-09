package com.example.easypeasyprogramming.Kotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.easypeasyprogramming.Java.Java_page_2;
import com.example.easypeasyprogramming.Java.Java_page_3E;
import com.example.easypeasyprogramming.R;

public class Kotlin_page_2 extends AppCompatActivity {

    Button kotlinEnglish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin_page_2);

        kotlinEnglish = (Button) findViewById(R.id.btn_kotlinEnglish);

        kotlinEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Kotlin_page_2.this, Kotlin_page_3E.class);
                startActivity(i1);

            }
        });
    }
}
