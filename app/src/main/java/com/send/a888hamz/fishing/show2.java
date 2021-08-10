package com.send.a888hamz.fishing;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import com.google.android.gms.ads.formats.NativeAd;

public class show2 extends AppCompatActivity {

    // Level
    private int sms;

    // random

    private int random;


    // imiges

    ImageView fish1;
    ImageView fish2;
    ImageView fish3;

    ImageView food1;
    ImageView food2;
    ImageView food3;


    // timer

    private Handler handler = new Handler();
    private Timer timer = new Timer();

    private int time;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show2);

        // resize text
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        WindowManager wm = getWindowManager();
        Display dp = wm.getDefaultDisplay();
        Point size = new Point();
        dp.getSize(size);
        float ratio = (size.x/480);


        TextView tt =(TextView)findViewById(R.id.txt);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView)findViewById(R.id.textView);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 6.3f*ratio);


        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        // timer

        time=10;
        txt=(TextView)findViewById(R.id.txt);

       // random

        int[] ro1= {R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,};
        int[] ro2= {R.drawable.f7,R.drawable.f20,R.drawable.f21,R.drawable.f22,R.drawable.f23,R.drawable.f24,};
        int[] ro3= {R.drawable.f25,R.drawable.f26,R.drawable.f27,R.drawable.f28,R.drawable.f29,R.drawable.f30,};


        // reseveer

        Bundle paste = getIntent().getExtras();
        sms = paste.getInt("sms");



        // imiges

        fish1=(ImageView)findViewById(R.id.fish1);
        fish2=(ImageView)findViewById(R.id.fish2);
        fish3=(ImageView)findViewById(R.id.fish3);

        food1=(ImageView)findViewById(R.id.food1);
        food2=(ImageView)findViewById(R.id.food2);
        food3=(ImageView)findViewById(R.id.food3);


        // work space

        Random roo = new Random();
        random=roo.nextInt(5);
        random++;

        food1.setBackgroundResource(ro1[random]);
        food2.setBackgroundResource(ro2[random]);
        food3.setBackgroundResource(ro3[random]);


        // time


        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {

                        time--;
                        txt.setText(time+"");



                        if (time<1){
                            gooo();
                        }

                    }
                });
            }
        }, 0, 1000);



    }

    public void gooo(){

        timer.cancel();
        Intent goo = new Intent(this,level_plus.class);
        goo.putExtra("sms",sms+10);
        goo.putExtra("random",random);
        startActivity(goo);
        finish();
    }

    public void gooo58(){

        timer.cancel();

        Intent go = new Intent(this,level_plus.class);
        go.putExtra("sms",2);
        startActivity(go);
        finish();

    }




    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        AlertDialog.Builder sms = new AlertDialog.Builder(this);
        sms.setMessage(R.string.sms4_1)
                .setIcon(R.drawable.common_google_signin_btn_icon_dark)
                .setTitle("")
                .setPositiveButton(R.string.sms4_2, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        timer.cancel();
                        Intent intent = new Intent(getApplicationContext(), go.class);
                        startActivity(intent);
                        finish();
                    }
                })

                .setNegativeButton(R.string.sms4_3, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .show();
    }

}
