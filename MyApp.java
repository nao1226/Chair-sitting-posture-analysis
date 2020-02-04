package com.example.mukai.sit;

import android.app.Application;

public class MyApp extends Application {

    private double good_body = 0.0;
    private double good_neck = 0.0;
    private double normal_body = 0.0;
    private double normal_neck = 0.0;

    @Override
    public void onCreate() {
        super.onCreate();
    }





    public double getgood_body() {
        return good_body;
    }

    public void setgood_body(double test) {
        good_body = test;
    }




    public double getgood_neck() {
        return good_neck;
    }

    public void setgood_neck(double test) {
        good_neck = test;
    }



    public double getnormal_body() {
        return normal_body;
    }

    public void setnormal_body(double test) {
        normal_body = test;
    }



    public double getnormal_neck() {
        return normal_neck;
    }

    public void setnormal_neck(double test) {
        normal_neck = test;
    }



}
