package com.example.easypeasyprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Video extends AppCompatActivity {

    TextView ud, cr, udt, edx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        ud = findViewById(R.id.tv_udemy);
        cr = findViewById(R.id.tv_coursera);
        udt = findViewById(R.id.tv_udacity);
        edx = findViewById(R.id.tv_edx);

        ud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/?utm_source=adwords-brand&utm_medium=udemyads&utm_campaign=Brand-Udemy_la.EN_cc.ROW&utm_term=_._ag_80315195513_._ad_386251995970_._de_c_._dm__._pl__._ti_kwd-310556426868_._li_9069450_._pd__._&utm_term=_._pd__._kw_udemy_._&matchtype=e&gclid=CjwKCAiAg9rxBRADEiwAxKDTuh8R5ZPfckXzKwWeVDENX5OJTuM5I29I_46LzXE_tuAESuEe3_zwqBoC1IoQAvD_BwE"));
                startActivity(i1);
            }
        });

        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coursera.org/"));
                startActivity(i2);
            }
        });

        udt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udacity.com/nanodegree?utm_source=gsem_brand&utm_medium=ads_r&utm_campaign=8305564463_c&utm_term=84143236463_sa&utm_keyword=udacity_e&gclid=CjwKCAiAg9rxBRADEiwAxKDTujuJRrLmPhzI5zrArzkFNkIvyh0HJbiu0yJuXNxvAoEB10lAy1_vORoC7lAQAvD_BwE"));
                startActivity(i3);
            }
        });

        edx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edx.org/"));
                startActivity(i4);
            }
        });
    }
}
