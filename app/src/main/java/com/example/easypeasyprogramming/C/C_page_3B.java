package com.example.easypeasyprogramming.C;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.easypeasyprogramming.R;
import com.github.barteksc.pdfviewer.PDFView;

public class C_page_3B extends AppCompatActivity {

    PDFView cB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_page_3_b);

        cB = (PDFView) findViewById(R.id.cBanglaPDF);
        cB.fromAsset("c/cBangla.pdf").load();

    }
}
