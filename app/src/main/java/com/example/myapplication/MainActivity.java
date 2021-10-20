package com.example.myapplication;

import static android.graphics.Color.RED;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button buttonchg;
    private Button buttonerror;
    private TextView label1;
    private Button buttonnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        buttonchg = (Button) findViewById(R.id.button1);
        label1 = (TextView) findViewById(R.id.label1) ;
        buttonerror=(Button) findViewById(R.id.button2);
        buttonnext= (Button) findViewById(R.id.button3);

        buttonchg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label1.setBackgroundColor(RED);
            }
        });

        buttonerror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(),Activity2.class);
                startActivity(otherActivity);

            }
        });
    }




    public void goToActivity2(View view){

        Log.e("DEVE0304", "MainActivity.goToActivity2()");
    };


    public void doSomePrinting(View view) {

        Log.e("DEVE0304", "MainActivity:doSomePrinting()");

        String [] list_of_languages = {"Java", "Python", "Php", "Ruby on Rail", "C++"};

        for (int idx = 0 ; idx <= list_of_languages.length ; idx ++)
            Log.e("DEVE0304", "" + idx + " : " + list_of_languages[idx]);

    }
}
