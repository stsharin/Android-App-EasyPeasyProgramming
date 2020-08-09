package com.example.easypeasyprogramming.CPP;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.easypeasyprogramming.C.C_page_2;
import com.example.easypeasyprogramming.C.C_page_3B;
import com.example.easypeasyprogramming.R;
import com.github.barteksc.pdfviewer.PDFView;

public class CPP_page_2 extends AppCompatActivity {

    Button cppEnglish;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp_page_2);

        cppEnglish = (Button) findViewById(R.id.btn_cppEnglish);


        cppEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(CPP_page_2.this, CPP_page_3E.class);
                startActivity(i1);

            }
        });


    }
}
