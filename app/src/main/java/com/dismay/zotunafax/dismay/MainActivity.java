package com.dismay.zotunafax.dismay;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface custom_font;
        custom_font = Typeface.createFromAsset(getAssets(), "fonts/font.ttf");

        TextView main_textView_header = (TextView) findViewById(R.id.main_textView_header);
        Button main_button_start = (Button) findViewById(R.id.main_button_start);

        main_textView_header.setTypeface(custom_font);
        main_button_start.setTypeface(custom_font);
    }
}