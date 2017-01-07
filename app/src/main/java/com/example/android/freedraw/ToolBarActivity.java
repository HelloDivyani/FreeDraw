package com.example.android.freedraw;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;



/**
 * Created by Divyani on 02-01-2017.
 */
public class ToolBarActivity extends AppCompatActivity
{

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(R.layout.tool);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LayoutInflater inflater = LayoutInflater.from(this);
        View contentView = inflater.inflate(layoutResID, null);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        layout.addView(contentView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }


}
