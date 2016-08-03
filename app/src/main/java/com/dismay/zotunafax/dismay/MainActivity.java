package com.dismay.zotunafax.dismay;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface custom_font;
        TextView header = (TextView) findViewById(R.id.header);

        custom_font = Typeface.createFromAsset(getAssets(), "fonts/font.ttf");

        header.setTypeface(custom_font);
    }
}