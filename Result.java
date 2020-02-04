package com.example.mukai.sit;



import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


public class Result extends AppCompatActivity {




    TextView good;
    Button Camera, Tips;

    private MyApp myApp;
    double goodbody,goodneck,normalbody,normalneck;
    double neck,body;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        myApp = (MyApp) this.getApplication();




        //  Display Size
        WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
        Display display = getWindowManager().getDefaultDisplay();
        Point realSize = new Point();
        display.getRealSize(realSize);
        int width = realSize.x;
        int height = realSize.y;

        goodbody = myApp.getgood_body();
        goodneck = myApp.getgood_neck();
        normalbody = myApp.getnormal_body();
        normalneck = myApp.getnormal_neck();

        body = normalbody-goodbody;
        neck = normalneck-goodneck;




        //  TextViews
        good = findViewById(R.id.good);
        good.setText("良い姿勢\n首の傾き = " + goodneck + "度\n" +
                "体の傾き = " + goodbody + "度\n\n普段の姿勢\n首の傾き = " + normalneck + "度\n" +
                        "体の傾き = " + normalbody + "度\n\n首の傾きの変化量\n" + neck + "度\n体の傾きの変化量\n" + body + "度\n" );
        good.setTextColor(Color.BLACK);






    }




    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug", "onStart()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug", "onRestart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug", "onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug", "onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug", "onStop()");
        System.gc();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug", "onDestroy()");
        System.gc();
    }
}
