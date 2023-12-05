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

        es.setOnClickListener(view -> {

            lang.updateResource("es");
            recreate();
        });
    }



}