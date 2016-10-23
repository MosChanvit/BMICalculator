package com.example.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent(); //ประกาศออบเจ็ค
        String h =intent.getStringExtra("h");
        String w =intent.getStringExtra("w");

        double hh=Double.parseDouble(h)/100;
        double ww=Double.parseDouble(w);
        DecimalFormat df=new DecimalFormat();
        df.applyPattern("0.00");


        Double BMI= (ww / (hh*hh));




        TextView tvbmi = (TextView) findViewById(R.id.tvbmi);
        TextView tvbmi2 = (TextView) findViewById(R.id.tvbmi2);

        tvbmi.setText(df.format(BMI));

        if(BMI<18.5){tvbmi2.setText("น้ำหนักน้อยกว่าปกติ ผอม");}
        else if(BMI>18.5&&BMI<25){tvbmi2.setText("น้ำหนักปกติ");}
        else if(BMI>25&&BMI<30){tvbmi2.setText("น้ำหนักมากกว่าปกติ ท้วม");}
        else if(BMI>=30){tvbmi2.setText("น้ำหนักมากกว่าปกติ อ้วน");}




    }
}
