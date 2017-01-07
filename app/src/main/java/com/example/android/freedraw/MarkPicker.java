package com.example.android.freedraw;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Divyani on 02-01-2017.
 */

public class MarkPicker extends AppCompatActivity {
    public static  final String PREF = "myfile";
    int mode;
    SharedPreferences o1;
    SharedPreferences.Editor e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mark);
        mode= Activity.MODE_PRIVATE;
        o1= getSharedPreferences(PREF,mode);
        e1=o1.edit();

    }

    public void red1(View v)
    {
        e1.putString("mCOLOR","#ff0000");
        Intent i=new Intent(this,MainActivity.class);
        e1.commit();
        startActivity(i);
    }
    public void green1(View v)
    {
        e1.putString("mCOLOR", "#00ff00");
        Intent i=new Intent(this,MainActivity.class);
        e1.commit();
        //Bundle b=new Bundle();

        //b.putString("COLOR", "GREEN");
        //i.putExtras(b);


        startActivity(i);
    }
    public void blue1(View v)
    {
        e1.putString("mCOLOR","#0000ff");
        Intent i=new Intent(this,MainActivity.class);
       /* Bundle b=new Bundle();

        b.putString("COLOR", "BlUE");
        i.putExtras(b);**/
        e1.commit();
        startActivity(i);
    }
    public void grey1(View v)
    {
        e1.putString("mCOLOR", "#cccccc");
        Intent i=new Intent(this,MainActivity.class);
      /*  Bundle b=new Bundle();

        b.putString("COLOR", "LTGREY");
        i.putExtras(b);**/
        e1.commit();
        startActivity(i);
    }
    public void yellow1(View v)
    {
        e1.putString("mCOLOR", "#ffff00");
        Intent i=new Intent(this,MainActivity.class);
        /*Bundle b=new Bundle();

        b.putString("COLOR", "YELLOW");
        i.putExtras(b);**/
        e1.commit();
        startActivity(i);
    }
    public void black1(View v)
    {
        e1.putString("mCOLOR", "#000000");
        Intent i=new Intent(this,MainActivity.class);
       /* Bundle b=new Bundle();

        b.putString("COLOR", "BLACK");
        i.putExtras(b);**/
        e1.commit();
        Toast.makeText(getApplicationContext(),"comiited",Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
    public void white1(View v)
    {
        e1.putString("mCOLOR", "#ffffff");
        Intent i=new Intent(this,MainActivity.class);
        /*Bundle b=new Bundle();

        b.putString("COLOR", "WHITE");
        i.putExtras(b);**/
        e1.commit();
        startActivity(i);
    }
    public void mag1(View v)
    {
        e1.putString("mCOLOR", "#ff00ff");
        Intent i=new Intent(this,MainActivity.class);
       /* Bundle b=new Bundle();

        b.putString("COLOR", "MAGNETA");
        i.putExtras(b);**/
        e1.commit();
        startActivity(i);
    }
    public void cyan1(View v)
    {
        e1.putString("mCOLOR", "#00ffff");
        Intent i=new Intent(this,MainActivity.class);
        /*Bundle b=new Bundle();

        b.putString("COLOR", "CYAN");
        i.putExtras(b);**/
        e1.commit();
        startActivity(i);
    }

}