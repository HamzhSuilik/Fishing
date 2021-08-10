package com.send.a888hamz.fishing;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int screen_width;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread g=new Thread(){
            @Override
            public void run() {
                //super.run();
                try {
                    sleep(1500);
                    Intent intent = new Intent(getApplicationContext(),go.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        g.start();

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

}
