package com.example.easypeasyprogramming.Java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.easypeasyprogramming.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Java_page_3E extends AppCompatActivity {

    PDFView je;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_page_3_e);

        je = (PDFView) findViewById(R.id.javaBanglaPDF);
        je.fromAsset("java/java_tutorial.pdf").load();
    }
}
