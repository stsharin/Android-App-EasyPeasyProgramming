package com.example.easypeasyprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.easypeasyprogramming.C.C_page_2;
import com.example.easypeasyprogramming.CPP.CPP_page_2;
import com.example.easypeasyprogramming.Java.Java_page_2;
import com.example.easypeasyprogramming.Kotlin.Kotlin_page_2;
import com.example.easypeasyprogramming.Python.Python_page_2;

public class Book extends AppCompatActivity {

    Button btnC, btnPython, btnJava, btnCPP, btnKotlin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        btnC = (Button) findViewById(R.id.btn_c);
        btnPython = (Button) findViewById(R.id.btn_python);
        btnJava = (Button) findViewById(R.id.btn_java);
        btnCPP = (Button) findViewById(R.id.btn_cpp);
        btnKotlin = (Button) findViewById(R.id.btn_kotlin);


        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Book.this, C_page_2.class);
                startActivity(i1);

            }
        });

        btnPython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(Book.this, Python_page_2.class);
                startActivity(i2);

            }
        });

        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(Book.this, Java_page_2.class);
                startActivity(i3);

            }
        });

        btnCPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i4 = new Intent(Book.this, CPP_page_2.class);
                startActivity(i4);

            }
        });

        btnKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5 = new Intent(Book.this, Kotlin_page_2.class);
                startActivity(i5);

            }
        });

    }
}
