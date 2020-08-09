package com.example.easypeasyprogramming.Python;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.easypeasyprogramming.R;

public class Python_page_2 extends AppCompatActivity {

    Button pythonEnglish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_page_2);

        pythonEnglish = (Button) findViewById(R.id.btn_pythonEnglish);


        pythonEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Python_page_2.this, Python_page_3E.class);
                startActivity(i1);

            }
        });

    }
}
