package com.example.android.freedraw;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Divyani on 02-01-2017.
 */
public class BackPicker extends AppCompatActivity
{
    public static  final String PREF = "mySharedPreferences";
    int mode;
    SharedPreferences o;
    SharedPreferences.Editor e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.back);
        mode= Activity.MODE_PRIVATE;
        o = getSharedPreferences(PREF,mode);
        e=o.edit();



    }
    public void red(View v)
    {
        e.putString("COLOR","#ff0000");
        Intent i=new Intent(this,MainActivity.class);
            e.commit();
        startActivity(i);
    }
    public void green(View v)
    {
        e.putString("COLOR", "#00ff00");
        Intent i=new Intent(this,MainActivity.class);
        e.commit();
        //Bundle b=new Bundle();

        //b.putString("COLOR", "GREEN");
        //i.putExtras(b);


                startActivity(i);
    }
    public void blue(View v)
    {
        e.putString("COLOR","#0000ff");
        Intent i=new Intent(this,MainActivity.class);
       /* Bundle b=new Bundle();

        b.putString("COLOR", "BlUE");
        i.putExtras(b);**/
        e.commit();
        startActivity(i);
    }
    public void grey(View v)
    {
        e.putString("COLOR", "#cccccc");
        Intent i=new Intent(this,MainActivity.class);
      /*  Bundle b=new Bundle();

        b.putString("COLOR", "LTGREY");
        i.putExtras(b);**/
        e.commit();
        startActivity(i);
    }
    public void yellow(View v)
    {
        e.putString("COLOR", "#ffff00");
        Intent i=new Intent(this,MainActivity.class);
        /*Bundle b=new Bundle();

        b.putString("COLOR", "YELLOW");
        i.putExtras(b);**/
        e.commit();
        startActivity(i);
    }
    public void black(View v)
    {
        e.putString("COLOR", "#000000");
        Intent i=new Intent(this,MainActivity.class);
       /* Bundle b=new Bundle();

        b.putString("COLOR", "BLACK");
        i.putExtras(b);**/
        e.commit();
        startActivity(i);
    }
    public void white(View v)
    {
        e.putString("COLOR", "#ffffff");
        Intent i=new Intent(this,MainActivity.class);
        /*Bundle b=new Bundle();

        b.putString("COLOR", "WHITE");
        i.putExtras(b);**/
        e.commit();
        startActivity(i);
    }
    public void mag(View v)
    {
        e.putString("COLOR", "#ff00ff");
        Intent i=new Intent(this,MainActivity.class);
       /* Bundle b=new Bundle();

        b.putString("COLOR", "MAGNETA");
        i.putExtras(b);**/
        e.commit();
        startActivity(i);
    }
    public void cyan(View v)
    {
        e.putString("COLOR", "#00ffff");
        Intent i=new Intent(this,MainActivity.class);
        /*Bundle b=new Bundle();

        b.putString("COLOR", "CYAN");
        i.putExtras(b);**/
        e.commit();
        startActivity(i);
    }
}

