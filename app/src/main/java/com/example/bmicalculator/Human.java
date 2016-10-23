package com.example.bmicalculator;


import android.content.Intent;

import java.text.DecimalFormat;

public class Human {

    Intent intent = getIntent(); //ประกาศออบเจ็ค
    String h =intent.getStringExtra("h");
    String w =intent.getStringExtra("w");

    double hh=Double.parseDouble(h);
    double ww=Double.parseDouble(w);



    public String BMI(){
        String BMI= (ww / (hh*hh) + "");
        return BMI;
    }

    public Intent getIntent() {
        return intent;
    }
}
