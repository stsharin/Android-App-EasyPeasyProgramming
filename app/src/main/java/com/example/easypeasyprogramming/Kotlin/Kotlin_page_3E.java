package com.example.easypeasyprogramming.Kotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.easypeasyprogramming.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Kotlin_page_3E extends AppCompatActivity {

    PDFView kt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin_page_3_e);

        kt = (PDFView) findViewById(R.id.kotlinEnglishPDF);
        kt.fromAsset("kotlin/kotlin_tutorial.pdf").load();
    }
}
