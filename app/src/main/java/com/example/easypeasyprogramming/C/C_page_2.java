package com.example.easypeasyprogramming.C;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.easypeasyprogramming.R;

public class C_page_2 extends AppCompatActivity {

    Button btnBangla, btnEnglish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_page_2);


        btnBangla = (Button) findViewById(R.id.btn_cBangla);
        btnEnglish = (Button) findViewById(R.id.btn_cEnglish);


        btnBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(C_page_2.this, C_page_3B.class);
                startActivity(i1);

            }
        });

        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(C_page_2.this, C_page_3E.class);
                startActivity(i2);

            }
        });
    }
}
