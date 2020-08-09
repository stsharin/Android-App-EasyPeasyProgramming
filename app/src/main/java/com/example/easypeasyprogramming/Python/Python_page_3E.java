package com.example.easypeasyprogramming.Python;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.easypeasyprogramming.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Python_page_3E extends AppCompatActivity {

    PDFView py;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_page_3_e);

        py = (PDFView) findViewById(R.id.pythonBanglaPDF);
        py.fromAsset("python/python_tutorial.pdf").load();
    }
}
