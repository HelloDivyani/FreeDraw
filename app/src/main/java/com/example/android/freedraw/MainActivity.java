package com.example.android.freedraw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ToolBarActivity

{
   // PopupWindow pop;
    //RelativeLayout r;
    LayoutInflater l;
    int mode;
    Paint paint;
    Point point1,point2;
    String rcolor;
    String mcolor;
        SharedPreferences o;
    SharedPreferences m;
    public static  final String PREF = "mySharedPreferences";
    public static final String pos="myfile";
    // Declare a variable of type path that can store <x,y> coordinates of points in the path

    Path path;
    List<Path> paths=new ArrayList<Path>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Panel(this));
        mode= Activity.MODE_PRIVATE;

        o=getSharedPreferences(PREF,mode);
        m=getSharedPreferences(pos, mode);
        rcolor = o.getString("COLOR", null);
        mcolor= m.getString("mCOLOR",null);
//        r=(RelativeLayout)findViewById(R.id.relative);
       // Intent i1=getIntent();
        //Bundle b1=i1.getExtras();

         //rcolor = b1.getString("COLOR");

    }
        /*public void popHelp()
        {
            l=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            ViewGroup c = (ViewGroup)l.inflate(R.layout.help,null);
            pop = new PopupWindow(c,400,400,true);
            pop.showAtLocation(r, Gravity.NO_GRAVITY,500,500);

        }**/
    @Override
      public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.activity_menu, menu);
    return true;
}


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch(item.getItemId())
        {
            case R.id.back:
            {
                Intent i2=new Intent(this,BackPicker.class);
                startActivity(i2);
                break;

            }
                //Toast.makeText(getApplicationContext(), "first", Toast.LENGTH_LONG).show();

            case R.id.clear:
                //Panel p=new Panel(getApplicationContext());
                //p.onDraw();
               // Intent i9=new Intent(this,MainActivity.class);
                //startActivity(i9);
                    recreate();
                break;

            case R.id.help:
            {
                Intent i7=new Intent(MainActivity.this,Help.class);
                startActivity(i7);

               // popHelp();
                break;
            }

                //Toast.makeText(getApplicationContext(),"third",Toast.LENGTH_LONG).show();

            case R.id.text:
               // Toast.makeText(getApplicationContext(),"third",Toast.LENGTH_LONG).show();
                Intent i5=new Intent(this,MarkPicker.class);
                startActivity(i5);
                break;
            case R.id.screen:
                Toast.makeText(getApplicationContext(),"Take ScreenShot By either by pressing the space between the 2 buttons on the sides of your phone or choosing a screenshot option from the above dropdown",Toast.LENGTH_LONG).show();
                break;


        }


        return super.onOptionsItemSelected(item);
    }








    class Panel extends View implements View.OnTouchListener
    {
        //Canvas p;


        public Panel(Context context) {
            super(context);
            paint=new Paint();





            paint.setStrokeWidth(10);
            paint.setStyle(Paint.Style.STROKE);
            this.setOnTouchListener(this);
          //  onDraw(this);

        }



        public void onDraw(Canvas canvas) {


            //set background colorr black
            if (mcolor == null) {
                // Toast.makeText(getApplicationContext(),"null ",Toast.LENGTH_SHORT).show();
                paint.setColor(Color.GREEN);

            } else {
                try {
                    paint.setColor(Color.parseColor(mcolor));

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Some color", Toast.LENGTH_SHORT).show();


                }

                if (rcolor == null) {
                    canvas.drawColor(Color.BLACK);
                } else {
                    try {
                        canvas.drawColor(Color.parseColor(rcolor));

                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Error has occured", Toast.LENGTH_SHORT).show();
                    }


                }


                //for each path in the path list draw the path on the canvas
                for (Path path : paths) {
                    canvas.drawPath(path, paint);
                }


            }
        }







         @Override
        public boolean onTouch(View view, MotionEvent event) {
            // if a pressed gesture has started
            if(event.getAction() == MotionEvent.ACTION_DOWN)
            {
                //obtain the current x and y coordinates and store them in an object of type point
                point1 =new Point();
               point1.x=(int)event.getX();
                point1.y=(int)event.getY();
                //initialize a new path variable
                path = new Path();
                //Add the current x and y coordinates to the path to indicate the starting point of the path
                path.moveTo(point1.x,point1.y);


            }
            // if a move gesture has happened after initializing a press gesture and before ending it
            else if(event.getAction() == MotionEvent.ACTION_MOVE)
            {
                // OBTAIN the current x and y coordinates
                point2 = new Point();
                point2.x=(int)event.getX();
                point2.y=(int)event.getY();
                // Add a line in the path from the last point to point2
                path.lineTo(point2.x,point2.y);
                //add the path to path list
                paths.add(path);
                //Invalidate the view
                invalidate();
            }
            return true;
        }
    }
}
