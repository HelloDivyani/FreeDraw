package com.example.android.freedraw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

/**
 * Created by Divyani on 05-01-2017.
 */
public class Help extends AppCompatActivity {
    TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        TextView tv = (TextView)findViewById(R.id.tv);
        SpannableString content = new SpannableString(" Help GuideLines ");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        tv.setText(content);

    }
}
