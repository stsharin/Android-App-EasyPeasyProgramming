package com.example.easypeasyprogramming.CPP;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.easypeasyprogramming.R;
import com.github.barteksc.pdfviewer.PDFView;

public class CPP_page_3E extends AppCompatActivity {

    PDFView cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp_page_3_e);

        cp = (PDFView) findViewById(R.id.cppBanglaPDF);
        cp.fromAsset("cpp/cpp_tutorial.pdf").load();
    }
}
