package com.example.firstandroid;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Button;



public class Pop extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup_window);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.7));
        LanguageManager lang = new LanguageManager(this);
        Button es = findViewById(R.id.btn_es);
        Button en = findViewById(R.id.btn_en);
        Button cn = findViewById(R.id.btn_cn);
        Button fr = findViewById(R.id.btn_fr);

        es.setOnClickListener(view -> {

            lang.updateResource("es");
            recreate();

        });
        en.setOnClickListener(view -> {

            lang.updateResource("en");
            recreate();
        });
        cn.setOnClickListener(view -> {

            lang.updateResource("zh");
            recreate();
        });
        fr.setOnClickListener(view -> {

            lang.updateResource("fr");
            recreate();
        });


    }



}