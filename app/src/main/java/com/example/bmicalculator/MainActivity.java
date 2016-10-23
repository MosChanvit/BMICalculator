package com.example.bmicalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edh =(EditText) findViewById(R.id.edh);
        final EditText edw =(EditText) findViewById(R.id.edw);
        Button btc=(Button) findViewById(R.id.btc);

        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edh.getText().toString().equals("")||edw.getText().toString().equals("")) {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this); //สร้างออบเจ็คไดอาล็อค
                    dialog.setTitle("ผิดพลาด"); //ไปที่เเวรูเเล้วก็สตริง
                    dialog.setMessage("ป้อนข้อมูลใหม่");

                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    dialog.show();

                }
            else {

                    Intent inten = new Intent(MainActivity.this, Main2Activity.class);
                    inten.putExtra("h", edh.getText().toString());
                    inten.putExtra("w", edw.getText().toString());
                    startActivity(inten);
                }

            }
        });





    }
}
