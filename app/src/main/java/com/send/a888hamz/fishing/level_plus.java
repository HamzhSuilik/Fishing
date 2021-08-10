package com.send.a888hamz.fishing;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.os.CountDownTimer;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class level_plus extends AppCompatActivity {

    // tekrar

    private boolean hhh;

    //mInterstitialAd ads

    private InterstitialAd mInterstitialAd;

    // get random

    private int random;

    // stop

    private int stop;

    // Hook
    private ImageView hook1;
    private ImageView hook2;
    private ImageView hook3;
    private int number;
    private int rr_all;

    // bar2

    LinearLayout bar2;

    // change recuare
    private int go;
    private int test;
    private int rr_new;

    // aditional point
    private ImageView plus_point;
    private ImageView plus_time;
    private int timer_plus;
    private int timer_plus2;
    private int randum_plus;
    private int key;
    private int key2;
    private TextView pt_txt;
    private TextView tim_txt;



    // PLUSE LEVEL
    int num;


    // chose
    private int chose;

    // start
    private boolean first;

    // control
    float up;
    float down;
    int tic;

    // points

    private TextView points;
    private TextView points2;
    private TextView points3;
    private TextView points4;

    private ImageView bar;
    private LinearLayout contener;

    private TextView gold;
    private TextView need;
    private int Gold;
    private int Need;

    // Arrays

      private int[] p={0, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2};

    // time

    private TextView time_text;
    private int time;

    // layout resize

    LinearLayout obj;
    float scale;

    // CONTER

    private boolean conter1;
    private int conter3;
    private int point;
    private ImageView img_point;

    private boolean conter1_2;
    private int conter3_2;
    private int point2;
    private ImageView img_point2;

    private boolean conter1_3;
    private int conter3_3;
    private int point3;
    private ImageView img_point3;

    private boolean conter1_4;
    private int conter3_4;
    private int point4;
    private ImageView img_point4;

    // try random
    Random roo = new Random();
    private int rr;
    private int on;

    private int on2;
    private int rr2;

    private int on3;
    private int rr3;

    private int on4;
    private int rr4;


    //screen size
    private int screen_hight;
    private int screen_width;

    // position
    private float px1;
    private float py1;

    private float px2;
    private float py2;

    private float px3;
    private float py3;

    private float px4;
    private float py4;

    private float px5;
    private float py5;

    private float px6;
    private float py6;

    private float px7;
    private float py7;

    private float px8;
    private float py8;

    private float px9;
    private float py9;

    private float px10;
    private float py10;

    private float px11;
    private float py11;

    private float px12;
    private float py12;

    private float px13;
    private float py13;

    private float px14;
    private float py14;

    private float px15;
    private float py15;

    private float px16;
    private float py16;

    private float px17;
    private float py17;

    private float px18;
    private float py18;

    private float px19;
    private float py19;

    private float px20;
    private float py20;


    // img
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;

    private ImageView img6;
    private ImageView img7;
    private ImageView img8;
    private ImageView img9;
    private ImageView img10;

    private ImageView img11;
    private ImageView img12;
    private ImageView img13;
    private ImageView img14;
    private ImageView img15;

    private ImageView img16;
    private ImageView img17;
    private ImageView img18;
    private ImageView img19;
    private ImageView img20;

    private ImageView fish;

    // img copy

    private int img1_1;
    private int img2_1;
    private int img3_1;
    private int img4_1;
    private int img5_1;

    private int img1_2;
    private int img2_2;
    private int img3_2;
    private int img4_2;
    private int img5_2;


    private int img6_1;
    private int img7_1;
    private int img8_1;
    private int img9_1;
    private int img10_1;

    private int img6_2;
    private int img7_2;
    private int img8_2;
    private int img9_2;
    private int img10_2;

    private int img11_1;
    private int img12_1;
    private int img13_1;
    private int img14_1;
    private int img15_1;

    private int img11_2;
    private int img12_2;
    private int img13_2;
    private int img14_2;
    private int img15_2;


    private int img16_1;
    private int img17_1;
    private int img18_1;
    private int img19_1;
    private int img20_1;

    private int img16_2;
    private int img17_2;
    private int img18_2;
    private int img19_2;
    private int img20_2;
    // move

    private Handler handler = new Handler();
    private Timer timer = new Timer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_plus);

        // tekrar
        hhh=true;

        // InterstitialAd

        mInterstitialAd = new InterstitialAd(this);

        mInterstitialAd.setAdUnitId("ca-app-pub-4147482011986095/4448282600");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {

                mInterstitialAd.loadAd(new AdRequest.Builder().build());

                next_ads();


            }

        });


        // stoop and start

        stop=1;

        // get random

        Bundle paste = getIntent().getExtras();

        random = paste.getInt("random");

        // Hook
        hook1=(ImageView)findViewById(R.id.hook1);
        hook2=(ImageView)findViewById(R.id.hook2);
        hook3=(ImageView)findViewById(R.id.hook3);
        number=2;
        rr_all=99;

        // change recuare

        go=1;
        test=0;
        rr_new=1;

        // aditional point
        plus_point = (ImageView) findViewById(R.id.plus);
        plus_time = (ImageView) findViewById(R.id.add_time);
        pt_txt=(TextView)findViewById(R.id.pt_txt);
        tim_txt=(TextView)findViewById(R.id.time_txt);
        timer_plus = 0;
        timer_plus2 = 0;
        randum_plus=0;
        key=0;
        key2=0;

        // plus level

        SharedPreferences gg = getSharedPreferences("level", Context.MODE_PRIVATE);
        num = gg.getInt("level", 1);

        // CHOSE

       // Bundle paste2 = getIntent().getExtras();

        chose = paste.getInt("sms");


        // start
        first = true;

        // control
        down = 0;
        up = 120;


        // point

        points = (TextView) findViewById(R.id.points);
        points2 = (TextView) findViewById(R.id.points2);
        points3 = (TextView) findViewById(R.id.points3);
        points4 = (TextView) findViewById(R.id.points4);

        bar = (ImageView) findViewById(R.id.bar);
        contener = (LinearLayout) findViewById(R.id.contener);

        Gold = 0;
        gold = (TextView) findViewById(R.id.gold);
        need = (TextView) findViewById(R.id.need);

        // timer
        time = 999;
        time_text = (TextView) findViewById(R.id.timer);

        if (chose == 11)
            tic = 32;
        if (chose == 12)
            tic = 30;
        if (chose == 13)
            tic = 28;
        if (chose == 14)
            tic = 28;
        if (chose == 15)
            tic = 28;

        tic=(tic*15)/10;

        // conter

        conter1 = false;
        conter3 = 0;

        conter1_2 = false;
        conter3_2 = 0;

        conter1_3 = false;
        conter3_3 = 0;

        conter1_3 = false;
        conter3_3 = 0;

        on = 1;
        on2 = 1;
        on3 = 1;
        on4 = 1;
        // img

        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);
        img5 = (ImageView) findViewById(R.id.img5);

        img6 = (ImageView) findViewById(R.id.img6);
        img7 = (ImageView) findViewById(R.id.img7);
        img8 = (ImageView) findViewById(R.id.img8);
        img9 = (ImageView) findViewById(R.id.img9);
        img10 = (ImageView) findViewById(R.id.img10);

        img11 = (ImageView) findViewById(R.id.img11);
        img12 = (ImageView) findViewById(R.id.img12);
        img13 = (ImageView) findViewById(R.id.img13);
        img14 = (ImageView) findViewById(R.id.img14);
        img15 = (ImageView) findViewById(R.id.img15);

        img16 = (ImageView) findViewById(R.id.img16);
        img17 = (ImageView) findViewById(R.id.img17);
        img18 = (ImageView) findViewById(R.id.img18);
        img19 = (ImageView) findViewById(R.id.img19);
        img20 = (ImageView) findViewById(R.id.img20);

        fish = (ImageView) findViewById(R.id.fish);


        // size

        WindowManager wm = getWindowManager();
        Display dp = wm.getDefaultDisplay();
        Point size = new Point();
        dp.getSize(size);
        screen_hight = size.y - 90;
        screen_width = size.x;

        // layout resize
/*

        obj = (LinearLayout) findViewById(R.id.obj);

        scale = (screen_width - 155.0f) / 368.0f;

        obj.setScaleX(scale);


        // bar2
        bar2=(LinearLayout)findViewById(R.id.bar2);
        bar2.setY((screen_hight+90)/2-75);
*/


        // location

        img1.setX(screen_width);
        img2.setX(screen_width);
        img3.setX(screen_width);
        img4.setX(screen_width);
        img5.setX(screen_width);

        img6.setX(screen_width);
        img7.setX(screen_width);
        img8.setX(screen_width);
        img9.setX(screen_width);
        img10.setX(screen_width);

        img11.setX(screen_width);
        img12.setX(screen_width);
        img13.setX(screen_width);
        img14.setX(screen_width);
        img15.setX(screen_width);

        img16.setX(screen_width);
        img17.setX(screen_width);
        img18.setX(screen_width);
        img19.setX(screen_width);
        img20.setX(screen_width);

        px1 = screen_width;
        px2 = screen_width;
        px3 = screen_width;
        px4 = screen_width;
        px5 = screen_width;

        px6 = screen_width;
        px7 = screen_width;
        px8 = screen_width;
        px9 = screen_width;
        px10 = screen_width;

        px11 = screen_width;
        px12 = screen_width;
        px13 = screen_width;
        px14 = screen_width;
        px5 = screen_width;

        px16 = screen_width;
        px17 = screen_width;
        px18 = screen_width;
        px19 = screen_width;
        px20 = screen_width;

        // timer

        //**************************************
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {


                        if (stop==1) {
                            if (chose == 11)
                                level_11();
                            if (chose == 12)
                                level_12();
                            if (chose == 13)
                                level_13();
                            if (chose == 14)
                                level_14();
                            if (chose == 15)
                                level_15();
                        }

                    }
                });
            }
        }, 0, tic);

        //************************************





    }


    public void img1(int i) {
        if (i == 1) {
            img1.setBackgroundResource(img1_1);
            px1 -= 10;

            if ((img1.getX() + img1.getWidth()) < 0) {
                py1 = (float) Math.floor(Math.random() * (screen_hight - img1.getHeight() - up - down));
                px1 = screen_width + 100.0f;
                on = 1;
                img1.setVisibility(View.VISIBLE);
            }

            img1.setX(px1);
            img1.setY(py1 + up);
        } else {
            img1.setBackgroundResource(img1_2);

            if (img1.getX() > screen_width) {
                py1 = (float) Math.floor(Math.random() * (screen_hight - img1.getHeight() - up - down));
                px1 = 0.0f - img1.getWidth();
                on = 1;
                img1.setVisibility(View.VISIBLE);
            }
            if (on == 0) {
                px1 += 10;
            }
            img1.setX(px1);
            img1.setY(py1 + up);
        }
    }

    public void img2(int i) {
        if (i == 1) {
            img2.setBackgroundResource(img2_1);
            px2 -= 10;

            if ((img2.getX() + img2.getWidth()) < 0) {
                py2 = (float) Math.floor(Math.random() * (screen_hight - img1.getHeight() - up - down));
                px2 = screen_width + 100.0f;
                on = 1;
                img2.setVisibility(View.VISIBLE);
            }

            img2.setX(px2);
            img2.setY(py2 + up);
        } else {
            img2.setBackgroundResource(img2_2);

            if (img2.getX() > screen_width) {
                py2 = (float) Math.floor(Math.random() * (screen_hight - img1.getHeight() - up - down));
                px2 = 0.0f - img2.getWidth();
                on = 1;
                img2.setVisibility(View.VISIBLE);
            }
            if (on == 0)
                px2 += 10;
            img2.setX(px2);
            img2.setY(py2 + up);
        }
    }

    public void img3(int i) {
        if (i == 1) {
            img3.setBackgroundResource(img3_1);
            px3 -= 10;

            if ((img3.getX() + img3.getWidth()) < 0) {
                py3 = (float) Math.floor(Math.random() * (screen_hight - img3.getHeight() - up - down));
                px3 = screen_width + 100.0f;
                on = 1;
                img3.setVisibility(View.VISIBLE);
            }

            img3.setX(px3);
            img3.setY(py3 + up);
        } else {
            img3.setBackgroundResource(img3_2);

            if (img3.getX() > screen_width) {
                py3 = (float) Math.floor(Math.random() * (screen_hight - img3.getHeight() - up - down));
                px3 = 0.0f - img1.getWidth();
                on = 1;
                img3.setVisibility(View.VISIBLE);
            }
            if (on == 0)
                px3 += 10;
            img3.setX(px3);
            img3.setY(py3 + up);
        }
    }

    public void img4(int i) {
        if (i == 1) {
            img4.setBackgroundResource(img4_1);
            px4 -= 10;

            if ((img4.getX() + img4.getWidth()) < 0) {
                py4 = (float) Math.floor(Math.random() * (screen_hight - img4.getHeight() - up - down));
                px4 = screen_width + 100.0f;
                on = 1;
                img4.setVisibility(View.VISIBLE);
            }

            img4.setX(px4);
            img4.setY(py4 + up);
        } else {
            img4.setBackgroundResource(img4_2);

            if (img4.getX() > screen_width) {
                py4 = (float) Math.floor(Math.random() * (screen_hight - img4.getHeight() - up - down));
                px4 = 0.0f - img1.getWidth();
                on = 1;
                img4.setVisibility(View.VISIBLE);
            }
            if (on == 0)
                px4 += 10;
            img4.setX(px4);
            img4.setY(py4 + up);
        }
    }

    public void img5(int i) {
        if (i == 1) {
            img5.setBackgroundResource(img5_1);
            px5 -= 10;

            if ((img5.getX() + img5.getWidth()) < 0) {
                py5 = (float) Math.floor(Math.random() * (screen_hight - img5.getHeight() - up - down));
                px5 = screen_width + 100.0f;
                on = 1;
                img5.setVisibility(View.VISIBLE);
            }

            img5.setX(px5);
            img5.setY(py5 + up);
        } else {
            img5.setBackgroundResource(img5_2);

            if (img5.getX() > screen_width) {
                py5 = (float) Math.floor(Math.random() * (screen_hight - img5.getHeight() - up - down));
                px5 = 0.0f - img5.getWidth();
                on = 1;
                img5.setVisibility(View.VISIBLE);
            }
            if (on == 0)
                px5 += 10;
            img5.setX(px5);
            img5.setY(py5 + up);
        }
    }

    public void img6(int i) {
        if (i == 1) {
            img6.setBackgroundResource(img6_1);
            px6 -= 10;

            if ((img6.getX() + img6.getWidth()) < 0) {
                py6 = (float) Math.floor(Math.random() * (screen_hight - img6.getHeight() - up - down));
                px6 = screen_width + 100.0f;
                on2 = 1;
                img6.setVisibility(View.VISIBLE);
            }

            img6.setX(px6);
            img6.setY(py6 + up);
        } else {
            img6.setBackgroundResource(img6_2);

            if (img6.getX() > screen_width) {
                py6 = (float) Math.floor(Math.random() * (screen_hight - img6.getHeight() - up - down));
                px6 = 0.0f - img6.getWidth();
                on2 = 1;
                img6.setVisibility(View.VISIBLE);
            }
            if (on2 == 0)
                px6 += 10;
            img6.setX(px6);
            img6.setY(py6 + up);
        }
    }

    public void img7(int i) {
        if (i == 1) {
            img7.setBackgroundResource(img7_1);
            px7 -= 10;

            if ((img7.getX() + img7.getWidth()) < 0) {
                py7 = (float) Math.floor(Math.random() * (screen_hight - img6.getHeight() - up - down));
                px7 = screen_width + 100.0f;
                on2 = 1;
                img7.setVisibility(View.VISIBLE);
            }

            img7.setX(px7);
            img7.setY(py7 + up);
        } else {
            img7.setBackgroundResource(img7_2);

            if (img7.getX() > screen_width) {
                py7 = (float) Math.floor(Math.random() * (screen_hight - img6.getHeight() - up - down));
                px7 = 0.0f - img7.getWidth();
                on2 = 1;
                img7.setVisibility(View.VISIBLE);
            }
            if (on2 == 0)
                px7 += 10;
            img7.setX(px7);
            img7.setY(py7 + up);
        }
    }

    public void img8(int i) {
        if (i == 1) {
            img8.setBackgroundResource(img8_1);
            px8 -= 10;

            if ((img8.getX() + img8.getWidth()) < 0) {
                py8 = (float) Math.floor(Math.random() * (screen_hight - img8.getHeight() - up - down));
                px8 = screen_width + 100.0f;
                on2 = 1;
                img8.setVisibility(View.VISIBLE);
            }

            img8.setX(px8);
            img8.setY(py8 + up);
        } else {
            img8.setBackgroundResource(img8_2);

            if (img8.getX() > screen_width) {
                py8 = (float) Math.floor(Math.random() * (screen_hight - img8.getHeight() - up - down));
                px8 = 0.0f - img6.getWidth();
                on2 = 1;
                img8.setVisibility(View.VISIBLE);
            }
            if (on2 == 0)
                px8 += 10;
            img8.setX(px8);
            img8.setY(py8 + up);
        }
    }

    public void img9(int i) {
        if (i == 1) {
            img9.setBackgroundResource(img9_1);
            px9 -= 10;

            if ((img9.getX() + img9.getWidth()) < 0) {
                py9 = (float) Math.floor(Math.random() * (screen_hight - img9.getHeight() - up - down));
                px9 = screen_width + 100.0f;
                on2 = 1;
                img9.setVisibility(View.VISIBLE);
            }

            img9.setX(px9);
            img9.setY(py9 + up);
        } else {
            img9.setBackgroundResource(img9_2);

            if (img9.getX() > screen_width) {
                py9 = (float) Math.floor(Math.random() * (screen_hight - img9.getHeight() - up - down));
                px9 = 0.0f - img6.getWidth();
                on2 = 1;
                img9.setVisibility(View.VISIBLE);
            }
            if (on2 == 0)
                px9 += 10;
            img9.setX(px9);
            img9.setY(py9 + up);
        }
    }

    public void img10(int i) {
        if (i == 1) {
            img10.setBackgroundResource(img10_1);
            px10 -= 10;

            if ((img10.getX() + img10.getWidth()) < 0) {
                py10 = (float) Math.floor(Math.random() * (screen_hight - img10.getHeight() - up - down));
                px10 = screen_width + 100.0f;
                on2 = 1;
                img10.setVisibility(View.VISIBLE);
            }

            img10.setX(px10);
            img10.setY(py10 + up);
        } else {
            img10.setBackgroundResource(img10_2);

            if (img10.getX() > screen_width) {
                py10 = (float) Math.floor(Math.random() * (screen_hight - img10.getHeight() - up - down));
                px10 = 0.0f - img10.getWidth();
                on2 = 1;
                img10.setVisibility(View.VISIBLE);
            }
            if (on2 == 0)
                px10 += 10;
            img10.setX(px10);
            img10.setY(py10 + up);
        }
    }

    public void img11(int i) {
        if (i == 1) {
            img11.setBackgroundResource(img11_1);
            px11 -= 10;

            if ((img11.getX() + img11.getWidth()) < 0) {
                py11 = (float) Math.floor(Math.random() * (screen_hight - img11.getHeight() - up - down));
                px11 = screen_width + 100.0f;
                on3 = 1;
                img11.setVisibility(View.VISIBLE);
            }

            img11.setX(px11);
            img11.setY(py11 + up);
        } else {
            img11.setBackgroundResource(img11_2);

            if (img11.getX() > screen_width) {
                py11 = (float) Math.floor(Math.random() * (screen_hight - img11.getHeight() - up - down));
                px11 = 0.0f - img11.getWidth();
                on3 = 1;
                img11.setVisibility(View.VISIBLE);
            }
            if (on3 == 0)
                px11 += 10;
            img11.setX(px11);
            img11.setY(py11 + up);
        }
    }

    public void img12(int i) {
        if (i == 1) {
            img12.setBackgroundResource(img12_1);
            px12 -= 10;

            if ((img12.getX() + img12.getWidth()) < 0) {
                py12 = (float) Math.floor(Math.random() * (screen_hight - img11.getHeight() - up - down));
                px12 = screen_width + 100.0f;
                on3 = 1;
                img12.setVisibility(View.VISIBLE);
            }

            img12.setX(px12);
            img12.setY(py12 + up);
        } else {
            img12.setBackgroundResource(img12_2);

            if (img12.getX() > screen_width) {
                py12 = (float) Math.floor(Math.random() * (screen_hight - img11.getHeight() - up - down));
                px12 = 0.0f - img12.getWidth();
                on3 = 1;
                img12.setVisibility(View.VISIBLE);
            }
            if (on3 == 0)
                px12 += 10;
            img12.setX(px12);
            img12.setY(py12 + up);
        }
    }

    public void img13(int i) {
        if (i == 1) {
            img13.setBackgroundResource(img13_1);
            px13 -= 10;

            if ((img13.getX() + img13.getWidth()) < 0) {
                py13 = (float) Math.floor(Math.random() * (screen_hight - img13.getHeight() - up - down));
                px13 = screen_width + 100.0f;
                on3 = 1;
                img13.setVisibility(View.VISIBLE);
            }

            img13.setX(px13);
            img13.setY(py13 + up);
        } else {
            img13.setBackgroundResource(img13_2);

            if (img13.getX() > screen_width) {
                py13 = (float) Math.floor(Math.random() * (screen_hight - img13.getHeight() - up - down));
                px13 = 0.0f - img11.getWidth();
                on3 = 1;
                img13.setVisibility(View.VISIBLE);
            }
            if (on3 == 0)
                px13 += 10;
            img13.setX(px13);
            img13.setY(py13 + up);
        }
    }

    public void img14(int i) {
        if (i == 1) {
            img14.setBackgroundResource(img14_1);
            px14 -= 10;

            if ((img14.getX() + img14.getWidth()) < 0) {
                py14 = (float) Math.floor(Math.random() * (screen_hight - img14.getHeight() - up - down));
                px14 = screen_width + 100.0f;
                on3 = 1;
                img14.setVisibility(View.VISIBLE);
            }

            img14.setX(px14);
            img14.setY(py14 + up);
        } else {
            img14.setBackgroundResource(img14_2);

            if (img14.getX() > screen_width) {
                py14 = (float) Math.floor(Math.random() * (screen_hight - img14.getHeight() - up - down));
                px14 = 0.0f - img11.getWidth();
                on3 = 1;
                img14.setVisibility(View.VISIBLE);
            }
            if (on3 == 0)
                px14 += 10;
            img14.setX(px14);
            img14.setY(py14 + up);
        }
    }

    public void img15(int i) {
        if (i == 1) {
            img15.setBackgroundResource(img15_1);
            px15 -= 10;

            if ((img15.getX() + img15.getWidth()) < 0) {
                py15 = (float) Math.floor(Math.random() * (screen_hight - img15.getHeight() - up - down));
                px15 = screen_width + 100.0f;
                on3 = 1;
                img15.setVisibility(View.VISIBLE);
            }

            img15.setX(px15);
            img15.setY(py15 + up);
        } else {
            img15.setBackgroundResource(img15_2);

            if (img15.getX() > screen_width) {
                py15 = (float) Math.floor(Math.random() * (screen_hight - img15.getHeight() - up - down));
                px15 = 0.0f - img15.getWidth();
                on3 = 1;
                img15.setVisibility(View.VISIBLE);
            }
            if (on3 == 0)
                px15 += 10;
            img15.setX(px15);
            img15.setY(py15 + up);
        }
    }

    public void img16(int i) {
        if (i == 1) {
            img16.setBackgroundResource(img16_1);
            px16 -= 10;

            if ((img16.getX() + img16.getWidth()) < 0) {
                py16 = (float) Math.floor(Math.random() * (screen_hight - img16.getHeight() - up - down));
                px16 = screen_width + 100.0f;
                on4 = 1;
                img16.setVisibility(View.VISIBLE);
            }

            img16.setX(px16);
            img16.setY(py16 + up);
        } else {
            img16.setBackgroundResource(img16_2);

            if (img16.getX() > screen_width) {
                py16 = (float) Math.floor(Math.random() * (screen_hight - img16.getHeight() - up - down));
                px16 = 0.0f - img16.getWidth();
                on4 = 1;
                img16.setVisibility(View.VISIBLE);
            }
            if (on4 == 0)
                px16 += 10;
            img16.setX(px16);
            img16.setY(py16 + up);
        }
    }

    public void img17(int i) {
        if (i == 1) {
            img17.setBackgroundResource(img17_1);
            px17 -= 10;

            if ((img17.getX() + img17.getWidth()) < 0) {
                py17 = (float) Math.floor(Math.random() * (screen_hight - img16.getHeight() - up - down));
                px17 = screen_width + 100.0f;
                on4 = 1;
                img17.setVisibility(View.VISIBLE);
            }

            img17.setX(px17);
            img17.setY(py17 + up);
        } else {
            img17.setBackgroundResource(img17_2);

            if (img17.getX() > screen_width) {
                py17 = (float) Math.floor(Math.random() * (screen_hight - img16.getHeight() - up - down));
                px17 = 0.0f - img17.getWidth();
                on4 = 1;
                img17.setVisibility(View.VISIBLE);
            }
            if (on4 == 0)
                px17 += 10;
            img17.setX(px17);
            img17.setY(py17 + up);
        }
    }

    public void img18(int i) {
        if (i == 1) {
            img18.setBackgroundResource(img18_1);
            px18 -= 10;

            if ((img18.getX() + img18.getWidth()) < 0) {
                py18 = (float) Math.floor(Math.random() * (screen_hight - img18.getHeight() - up - down));
                px18 = screen_width + 100.0f;
                on4 = 1;
                img18.setVisibility(View.VISIBLE);
            }

            img18.setX(px18);
            img18.setY(py18 + up);
        } else {
            img18.setBackgroundResource(img18_2);

            if (img18.getX() > screen_width) {
                py18 = (float) Math.floor(Math.random() * (screen_hight - img18.getHeight() - up - down));
                px18 = 0.0f - img16.getWidth();
                on4 = 1;
                img18.setVisibility(View.VISIBLE);
            }
            if (on4 == 0)
                px18 += 10;
            img18.setX(px18);
            img18.setY(py18 + up);
        }
    }

    public void img19(int i) {
        if (i == 1) {
            img19.setBackgroundResource(img19_1);
            px19 -= 10;

            if ((img19.getX() + img19.getWidth()) < 0) {
                py19 = (float) Math.floor(Math.random() * (screen_hight - img19.getHeight() - up - down));
                px19 = screen_width + 100.0f;
                on4 = 1;
                img19.setVisibility(View.VISIBLE);
            }

            img19.setX(px19);
            img19.setY(py19 + up);
        } else {
            img19.setBackgroundResource(img19_2);

            if (img19.getX() > screen_width) {
                py19 = (float) Math.floor(Math.random() * (screen_hight - img19.getHeight() - up - down));
                px19 = 0.0f - img16.getWidth();
                on4 = 1;
                img19.setVisibility(View.VISIBLE);
            }
            if (on4 == 0)
                px19 += 10;
            img19.setX(px19);
            img19.setY(py19 + up);
        }
    }

    public void img20(int i) {
        if (i == 1) {
            img20.setBackgroundResource(img20_1);
            px20 -= 10;

            if ((img20.getX() + img20.getWidth()) < 0) {
                py20 = (float) Math.floor(Math.random() * (screen_hight - img20.getHeight() - up - down));
                px20 = screen_width + 100.0f;
                on4 = 1;
                img20.setVisibility(View.VISIBLE);
            }

            img20.setX(px20);
            img20.setY(py20 + up);
        } else {
            img20.setBackgroundResource(img20_2);

            if (img20.getX() > screen_width) {
                py20 = (float) Math.floor(Math.random() * (screen_hight - img20.getHeight() - up - down));
                px20 = 0.0f - img20.getWidth();
                on4 = 1;
                img20.setVisibility(View.VISIBLE);
            }
            if (on4 == 0)
                px20 += 10;
            img20.setX(px20);
            img20.setY(py20 + up);
        }
    }


    public void level_11() {


        if (first == true) {

            rr_all=3;
            int[] point = {0, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1,1, 2, 3, 1, 2, 3, 1, 2, 3, 1};


            int[] ro1= {R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,};
            int[] ro2= {R.drawable.f7,R.drawable.f20,R.drawable.f21,R.drawable.f22,R.drawable.f23,R.drawable.f24,};
            int[] ro3= {R.drawable.f25,R.drawable.f26,R.drawable.f27,R.drawable.f28,R.drawable.f29,R.drawable.f30,};

            int[] ro1_2= {R.drawable.ff1,R.drawable.ff2,R.drawable.ff3,R.drawable.ff4,R.drawable.ff5,R.drawable.ff6,};
            int[] ro2_2= {R.drawable.ff7,R.drawable.ff20,R.drawable.ff21,R.drawable.ff22,R.drawable.ff23,R.drawable.ff24,};
            int[] ro3_2= {R.drawable.ff25,R.drawable.ff26,R.drawable.ff27,R.drawable.ff28,R.drawable.ff29,R.drawable.ff30,};

            int img[][] = {{0},
                    {0, ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random]},
                    {0, ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random]},
                    {0, ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random]},
                    {0, ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random]}
            };

            imge_name_and_point(point, img, R.drawable.hook2);

            first(100, 300);

        }
        timer();
        anmi1();
        check();

        anmi2();
        check2();

        addition(5500, 1500, 3000);


        point();

        if ((time < 1) || (Gold >= Need)) {
            if (Gold >= Need) {
                if (num == 11)
                    save(12);
            }
            next();
        }

    }

    public void level_12() {

        if (first == true) {

            int[] point = {0, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1,1, 2, 3, 1, 2, 3, 1, 2, 3, 1};


            int[] ro1= {R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,};
            int[] ro2= {R.drawable.f7,R.drawable.f20,R.drawable.f21,R.drawable.f22,R.drawable.f23,R.drawable.f24,};
            int[] ro3= {R.drawable.f25,R.drawable.f26,R.drawable.f27,R.drawable.f28,R.drawable.f29,R.drawable.f30,};

            int[] ro1_2= {R.drawable.ff1,R.drawable.ff2,R.drawable.ff3,R.drawable.ff4,R.drawable.ff5,R.drawable.ff6,};
            int[] ro2_2= {R.drawable.ff7,R.drawable.ff20,R.drawable.ff21,R.drawable.ff22,R.drawable.ff23,R.drawable.ff24,};
            int[] ro3_2= {R.drawable.ff25,R.drawable.ff26,R.drawable.ff27,R.drawable.ff28,R.drawable.ff29,R.drawable.ff30,};

            int img[][] = {{0},
                    {0, ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random]},
                    {0, ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random]},
                    {0, ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random]},
                    {0, ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random]}
            };

            imge_name_and_point(point, img, R.drawable.ff9);
            first(100, 450);
        }


        timer();
        anmi1();
        check();
        anmi2();
        check2();

        anmi3();
        check3();
        point();

        addition(5500, 1500, 3000);
        if ((time < 1) || (Gold >= Need)) {
            if (Gold >= Need) {
                if (num == 12)
                    save(13);
            }
            next();
        }

    }

    public void level_13() {
        if (first == true) {

            rr_all=3;
            int[] point = {0, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1,1, 2, 3, 1, 2, 3, 1, 2, 3, 1};


            int[] ro1= {R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,};
            int[] ro2= {R.drawable.f7,R.drawable.f20,R.drawable.f21,R.drawable.f22,R.drawable.f23,R.drawable.f24,};
            int[] ro3= {R.drawable.f25,R.drawable.f26,R.drawable.f27,R.drawable.f28,R.drawable.f29,R.drawable.f30,};

            int[] ro1_2= {R.drawable.ff1,R.drawable.ff2,R.drawable.ff3,R.drawable.ff4,R.drawable.ff5,R.drawable.ff6,};
            int[] ro2_2= {R.drawable.ff7,R.drawable.ff20,R.drawable.ff21,R.drawable.ff22,R.drawable.ff23,R.drawable.ff24,};
            int[] ro3_2= {R.drawable.ff25,R.drawable.ff26,R.drawable.ff27,R.drawable.ff28,R.drawable.ff29,R.drawable.ff30,};

            int img[][] = {{0},
                    {0, ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random]},
                    {0, ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random]},
                    {0, ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random]},
                    {0, ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random]}
            };


            imge_name_and_point(point, img, R.drawable.f2);
            first(150, 800);
        }


        timer();

        anmi1();
        check();

        anmi2();
        check2();

        anmi3();
        check3();

        anmi4();
        check4();

        point();

        addition(5500, 1500, 3000);
        if ((time < 1) || (Gold >= Need)) {
            if (Gold >= Need) {
                if (num == 13)
                    save(14);
            }
            next();
        }

    }

    public void level_14() {
        if (first == true) {

            int[] point = {0, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1,1, 2, 3, 1, 2, 3, 1, 2, 3, 1};


            int[] ro1= {R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,};
            int[] ro2= {R.drawable.f7,R.drawable.f20,R.drawable.f21,R.drawable.f22,R.drawable.f23,R.drawable.f24,};
            int[] ro3= {R.drawable.f25,R.drawable.f26,R.drawable.f27,R.drawable.f28,R.drawable.f29,R.drawable.f30,};

            int[] ro1_2= {R.drawable.ff1,R.drawable.ff2,R.drawable.ff3,R.drawable.ff4,R.drawable.ff5,R.drawable.ff6,};
            int[] ro2_2= {R.drawable.ff7,R.drawable.ff20,R.drawable.ff21,R.drawable.ff22,R.drawable.ff23,R.drawable.ff24,};
            int[] ro3_2= {R.drawable.ff25,R.drawable.ff26,R.drawable.ff27,R.drawable.ff28,R.drawable.ff29,R.drawable.ff30,};

            int img[][] = {{0},
                    {0, ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random]},
                    {0, ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random]},
                    {0, ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random]},
                    {0, ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random]}
            };

            imge_name_and_point(point, img, R.drawable.f1);
            first(150, 900);
        }


        timer();
        anmi1();
        check();
        anmi2();
        check2();


        anmi3();
        check3();
        anmi4();
        check4();


        point();

        addition(5500, 1500, 3000);

        if ((time < 1) || (Gold >= Need)) {
            if (Gold >= Need) {
                if (num == 14)
                    save(15);
            }
            next();
        }
    }

    public void level_15() {
        if (first == true) {

            int[] point = {0, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1,1, 2, 3, 1, 2, 3, 1, 2, 3, 1};


            int[] ro1= {R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5,R.drawable.f6,};
            int[] ro2= {R.drawable.f7,R.drawable.f20,R.drawable.f21,R.drawable.f22,R.drawable.f23,R.drawable.f24,};
            int[] ro3= {R.drawable.f25,R.drawable.f26,R.drawable.f27,R.drawable.f28,R.drawable.f29,R.drawable.f30,};

            int[] ro1_2= {R.drawable.ff1,R.drawable.ff2,R.drawable.ff3,R.drawable.ff4,R.drawable.ff5,R.drawable.ff6,};
            int[] ro2_2= {R.drawable.ff7,R.drawable.ff20,R.drawable.ff21,R.drawable.ff22,R.drawable.ff23,R.drawable.ff24,};
            int[] ro3_2= {R.drawable.ff25,R.drawable.ff26,R.drawable.ff27,R.drawable.ff28,R.drawable.ff29,R.drawable.ff30,};

            int img[][] = {{0},
                    {0, ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random]},
                    {0, ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random]},
                    {0, ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random], ro2[random], ro3[random], ro1[random]},
                    {0, ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random], ro2_2[random], ro3_2[random], ro1_2[random]}
            };

            imge_name_and_point(point, img, R.drawable.f5);
            first(150, 1000);
        }


        timer();
        anmi1();
        check();
        anmi2();
        check2();


        anmi3();
        check3();
        anmi4();
        check4();

        addition(5500, 1500, 3000);
        point();
        addition(4500,100,3000);

        if ((time < 1) || (Gold >= Need)) {
            if (Gold >= Need) {
                if (num == 15)
                    save(16);
            }
            next();
        }
    }




    public void check() {
        if (conter1 == true) {

            conter3++;
            // first
            if (conter3 == 1) {

                if(point>0)
                    rr_all = roo.nextInt(5)+1;


                points.setTranslationX(img_point.getTranslationX());
                points.setTranslationY(img_point.getTranslationY());
                points.setX(img_point.getX());
                points.setY(img_point.getY());
                points.setVisibility(View.VISIBLE);
                points.setText("+" + point);
                points.setTextColor(Color.GREEN);
                if (point < 0) {
                    point = point * -1;
                    points.setText(point + "-");
                    points.setTextColor(Color.RED);
                }

            }

            // end
            if (conter3 == 50) {
                conter1 = false;
                conter3 = 0;
                points.setVisibility(View.INVISIBLE);


            }
        }
    }

    public void check2() {
        if (conter1_2 == true) {

            conter3_2++;
            // first
            if (conter3_2 == 1) {

                if(point2>0)
                    rr_all = roo.nextInt(5)+1;

                points2.setTranslationX(img_point2.getTranslationX());
                points2.setTranslationY(img_point2.getTranslationY());
                points2.setX(img_point2.getX());
                points2.setY(img_point2.getY());
                points2.setVisibility(View.VISIBLE);
                points2.setText("+" + point2);
                points2.setTextColor(Color.GREEN);
                if (point2 < 0) {
                    point2 = point2 * -1;
                    points2.setText(point2 + "-");
                    points2.setTextColor(Color.RED);
                }

            }

            // end
            if (conter3_2 == 50) {
                conter1_2 = false;
                conter3_2 = 0;
                points2.setVisibility(View.INVISIBLE);

            }
        }
    }

    public void check3() {
        if (conter1_3 == true) {

            conter3_3++;
            // first
            if (conter3_3 == 1) {

                if(point3>0)
                    rr_all = roo.nextInt(5)+1;


                points3.setTranslationX(img_point3.getTranslationX());
                points3.setTranslationY(img_point3.getTranslationY());
                points3.setX(img_point3.getX());
                points3.setY(img_point3.getY());
                points3.setVisibility(View.VISIBLE);
                points3.setText("+" + point3);
                points3.setTextColor(Color.GREEN);
                if (point3 < 0) {
                    point3 = point3 * -1;
                    points3.setText(point3 + "-");
                    points3.setTextColor(Color.RED);
                }

            }

            // end
            if (conter3_3 == 50) {
                conter1_3 = false;
                conter3_3 = 0;
                points3.setVisibility(View.INVISIBLE);

            }
        }
    }

    public void check4() {
        if (conter1_4 == true) {

            conter3_4++;
            // first
            if (conter3_4 == 1) {

                if(point4>0)
                    rr_all = roo.nextInt(5)+1;

                points4.setTranslationX(img_point4.getTranslationX());
                points4.setTranslationY(img_point4.getTranslationY());
                points4.setX(img_point4.getX());
                points4.setY(img_point4.getY());
                points4.setVisibility(View.VISIBLE);
                points4.setText("+" + point4);
                points4.setTextColor(Color.GREEN);
                if (point4 < 0) {
                    point4 = point4 * -1;
                    points4.setText(point4 + "-");
                    points4.setTextColor(Color.RED);
                }

            }

            // end
            if (conter3_4 == 50) {
                conter1_4 = false;
                conter3_4 = 0;
                points4.setVisibility(View.INVISIBLE);

            }
        }
    }


    public void click1(View view) {

        conter1 = true;

        if(number==p[1])
            point=10;
        else
            point=-5;

        Gold += point;
        img_point = img1;
        on = 1;
        img1.setVisibility(View.INVISIBLE);
        conter3 = 0;


    }

    public void click2(View view) {

        conter1 = true;
        if(number==p[2])
            point=10;
        else
            point=-5;
        Gold += point;
        img_point = img2;
        on = 1;
        img2.setVisibility(View.INVISIBLE);
        conter3 = 0;

    }

    public void click3(View view) {


        conter1 = true;
        if(number==p[3])
            point=10;
        else
            point=-5;
        Gold += point;
        img_point = img3;
        on = 1;
        img3.setVisibility(View.INVISIBLE);
        conter3 = 0;

    }

    public void click4(View view) {


        conter1 = true;
        if(number==p[4])
            point=10;
        else
            point=-5;
        Gold += point;
        img_point = img4;
        on = 1;
        img4.setVisibility(View.INVISIBLE);
        conter3 = 0;

    }

    public void click5(View view) {

        conter1 = true;
        if(number==p[5])
            point=10;
        else
            point=-5;
        Gold += point;
        img_point = img5;
        on = 1;
        img5.setVisibility(View.INVISIBLE);
        conter3 = 0;

    }

    public void click6(View view) {


        conter1_2 = true;
        if(number==p[6])
            point2=10;
        else
            point2=-5;
        Gold += point2;
        img_point2 = img6;
        on2 = 1;
        img6.setVisibility(View.INVISIBLE);
        conter3_2 = 0;

    }

    public void click7(View view) {


        conter1_2 = true;
        if(number==p[7])
            point2=10;
        else
            point2=-5;
        Gold += point2;
        img_point2 = img7;
        on2 = 1;
        img7.setVisibility(View.INVISIBLE);
        conter3_2 = 0;

    }

    public void click8(View view) {


        conter1_2 = true;
        if(number==p[8])
            point2=10;
        else
            point2=-5;
        Gold += point2;
        img_point2 = img8;
        on2 = 1;
        img8.setVisibility(View.INVISIBLE);
        conter3_2 = 0;

    }

    public void click9(View view) {


        conter1_2 = true;
        if(number==p[9])
            point2=10;
        else
            point2=-5;
        Gold += point2;
        img_point2 = img9;
        on2 = 1;
        img9.setVisibility(View.INVISIBLE);
        conter3_2 = 0;

    }

    public void click10(View view) {


        conter1_2 = true;
        if(number==p[10])
            point2=10;
        else
            point2=-5;
        Gold += point2;
        img_point2 = img10;
        on2 = 1;
        img10.setVisibility(View.INVISIBLE);
        conter3_2 = 0;

    }


    public void click11(View view) {


        conter1_3 = true;
        if(number==p[11])
            point3=10;
        else
            point3=-5;
        Gold += point3;
        img_point3 = img11;
        on3 = 1;
        img11.setVisibility(View.INVISIBLE);
        conter3 = 0;

    }

    public void click12(View view) {

        conter1_3 = true;
        if(number==p[12])
            point3=10;
        else
            point3=-5;
        Gold += point3;
        img_point3 = img12;
        on3 = 1;
        img12.setVisibility(View.INVISIBLE);
        conter3 = 0;

    }

    public void click13(View view) {

        conter1_3 = true;
        if(number==p[13])
            point3=10;
        else
            point3=-5;
        Gold += point3;
        img_point3 = img13;
        on3 = 1;
        img13.setVisibility(View.INVISIBLE);
        conter3 = 0;

    }

    public void click14(View view) {

        conter1_3 = true;
        if(number==p[14])
            point3=10;
        else
            point3=-5;
        Gold += point3;
        img_point3 = img14;
        on3 = 1;
        img14.setVisibility(View.INVISIBLE);
        conter3 = 0;

    }

    public void click15(View view) {

        conter1_3 = true;
        if(number==p[15])
            point3=10;
        else
            point3=-5;
        Gold += point3;
        img_point3 = img15;
        on3 = 1;
        img15.setVisibility(View.INVISIBLE);
        conter3 = 0;

    }

    public void click16(View view) {

        conter1_4 = true;
        if(number==p[16])
            point4=10;
        else
            point4=-5;
        Gold += point4;
        img_point4 = img16;
        on4 = 1;
        img16.setVisibility(View.INVISIBLE);
        conter3_4 = 0;

    }

    public void click17(View view) {

        conter1_4 = true;
        if(number==p[17])
            point4=10;
        else
            point4=-5;
        Gold += point4;
        img_point4 = img17;
        on4 = 1;
        img17.setVisibility(View.INVISIBLE);
        conter3_4 = 0;

    }

    public void click18(View view) {

        conter1_4 = true;
        if(number==p[18])
            point4=10;
        else
            point4=-5;
        Gold += point4;
        img_point4 = img18;
        on4 = 1;
        img18.setVisibility(View.INVISIBLE);
        conter3_4 = 0;

    }

    public void click19(View view) {

        conter1_4 = true;
        if(number==p[19])
            point4=10;
        else
            point4=-5;
        Gold += point4;
        img_point4 = img19;

        on4 = 1;
        img19.setVisibility(View.INVISIBLE);
        conter3_4 = 0;

    }

    public void click20(View view) {

        conter1_4 = true;
        if(number==p[20])
            point4=10;
        else
            point4=-5;
        Gold += point4;
        img_point4 = img20;
        on4 = 1;
        img20.setVisibility(View.INVISIBLE);
        conter3_4 = 0;

    }

    public void anmi1() {

        if (on == 1) {
            if(rr_all==99) {
                on = roo.nextInt(10);
                rr = on + 1;
                on = 0;
            }
            else{
                rr = rr_all;
                on = 0;
            }
        }

        if (rr == 1)
            img1(1);
        if (rr == 2)
            img2(1);
        if (rr == 3)
            img3(1);
        if (rr == 4)
            img4(1);
        if (rr == 5)
            img5(1);

        if (rr == 6)
            img1(2);
        if (rr == 7)
            img2(2);
        if (rr == 8)
            img3(2);
        if (rr == 9)
            img4(2);
        if (rr == 10)
            img5(2);

    }

    public void anmi2() {
        if (on2 == 1) {
            if(rr_all==99) {
                on2 = roo.nextInt(10);
                rr2 = on2 + 1;
                on2 = 0;
            }
            else{
                rr2 = rr_all+5;
                on2 = 0;
            }
        }

        if (rr2 == 1)
            img6(1);
        if (rr2 == 2)
            img7(1);
        if (rr2 == 3)
            img8(1);
        if (rr2 == 4)
            img9(1);
        if (rr2 == 5)
            img10(1);

        if (rr2 == 6)
            img6(2);
        if (rr2 == 7)
            img7(2);
        if (rr2 == 8)
            img8(2);
        if (rr2 == 9)
            img9(2);
        if (rr2 == 10)
            img10(2);
    }

    public void anmi3() {
        if (on3 == 1) {
            if(rr_all==99) {
                on3 = roo.nextInt(10);
                rr3 = on3 + 1;
                on3 = 0;
            }
            else{
                rr3 = rr_all;
                on3 = 0;
            }
        }

        if (rr3 == 1)
            img11(1);
        if (rr3 == 2)
            img12(1);
        if (rr3 == 3)
            img13(1);
        if (rr3 == 4)
            img14(1);
        if (rr3 == 5)
            img15(1);

        if (rr3 == 6)
            img11(2);
        if (rr3 == 7)
            img12(2);
        if (rr3 == 8)
            img13(2);
        if (rr3 == 9)
            img14(2);
        if (rr3 == 10)
            img15(2);

    }

    public void anmi4() {
        if (on4 == 1) {
            if(rr_all==99) {
                on4 = roo.nextInt(10);
                rr4 = on4 + 1;
                on4 = 0;
            }
            else{
                rr4 = rr_all+5;
                on4 = 0;
            }
        }

        if (rr4 == 1)
            img16(1);
        if (rr4 == 2)
            img17(1);
        if (rr4 == 3)
            img18(1);
        if (rr4 == 4)
            img19(1);
        if (rr4 == 5)
            img20(1);

        if (rr4 == 6)
            img16(2);
        if (rr4 == 7)
            img17(2);
        if (rr4 == 8)
            img18(2);
        if (rr4 == 9)
            img19(2);
        if (rr4 == 10)
            img20(2);
    }

    public void imge_name_and_point(int[] pp, int[][] img, int Fish) {

        img1_1 = img[1][1];
        img2_1 = img[1][2];
        img3_1 = img[1][3];
        img4_1 = img[1][4];
        img5_1 = img[1][5];

        img1_2 = img[2][1];
        img2_2 = img[2][2];
        img3_2 = img[2][3];
        img4_2 = img[2][4];
        img5_2 = img[2][5];

        img6_1 = img[1][6];
        img7_1 = img[1][7];
        img8_1 = img[1][8];
        img9_1 = img[1][9];
        img10_1 = img[1][10];

        img6_2 = img[2][6];
        img7_2 = img[2][7];
        img8_2 = img[2][8];
        img9_2 = img[2][9];
        img10_2 = img[2][10];


        img11_1 = img[3][1];
        img12_1 = img[3][2];
        img13_1 = img[3][3];
        img14_1 = img[3][4];
        img15_1 = img[3][5];

        img11_2 = img[4][1];
        img12_2 = img[4][2];
        img13_2 = img[4][3];
        img14_2 = img[4][4];
        img15_2 = img[4][5];

        img16_1 = img[3][6];
        img17_1 = img[3][7];
        img18_1 = img[3][8];
        img19_1 = img[3][9];
        img20_1 = img[3][10];

        img16_2 = img[4][6];
        img17_2 = img[4][7];
        img18_2 = img[4][8];
        img19_2 = img[4][9];
        img20_2 = img[4][10];

        p = pp;

        fish.setBackgroundResource(Fish);


    }

    public void timer() {
        time -= tic;
        time_text.setText(String.valueOf(time / 1000));
    }

    public void point() {
        gold.setText(Gold + "");
        if (Gold >= 0)
            bar.setScaleX((Gold * (screen_width-16.0f)) / Need);
    }

    public void first(int sec, int need2) {

        Need = need2;
        need.setText(String.valueOf(need2));
        time_text.setText(String.valueOf(sec));
        time = sec * 1000;

        first = false;
    }

    public void end(int next) {
/*
        if(Gold>=Need){
            SharedPreferences gg = getSharedPreferences("level", Context.MODE_PRIVATE);
            SharedPreferences.Editor copy = gg.edit();
            copy.putInt("level",next);
            copy.apply();

            Intent go = new Intent(this,face.class);
            startActivity(go);
            finish();
        }
*/
        Intent goo = new Intent(this, face.class);
        startActivity(goo);
        finish();

        //finish();
    }

    public void next() {
        timer.cancel();


        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }else {

            if (Gold >= Need) {
                if (hhh==true) {
                    hhh = false;
                    Intent go = new Intent(this, pass.class);
                    go.putExtra("sms", chose);
                    startActivity(go);
                    finish();
                }
            } else {
                if (hhh==true) {
                    hhh = false;
                    Intent go = new Intent(this, fail.class);
                    go.putExtra("sms", chose);
                    startActivity(go);
                    finish();
                }
            }
        }
    }

    public void next_ads() {


        if (Gold >= Need) {
            if (hhh==true) {
                hhh = false;
                Intent go = new Intent(this, pass.class);
                go.putExtra("sms", chose);
                startActivity(go);
                finish();
            }
        } else {
            if (hhh==true) {
                hhh = false;
                Intent go = new Intent(this, fail.class);
                go.putExtra("sms", chose);
                startActivity(go);
                finish();
            }
        }

    }

    public void save(int i) {
        SharedPreferences gg = getSharedPreferences("level", Context.MODE_PRIVATE);
        SharedPreferences.Editor copy = gg.edit();
        copy.putInt("level", i);
        copy.apply();
    }

    public void addition(int rro,int pt,int tim) {

        if (key==0) {
            randum_plus = roo.nextInt(rro);

            if (randum_plus==pt){
                key=1;
            }

            if (randum_plus==tim){
                key=2;
            }

        }



        if (key==1) {
            plus_point.setVisibility(View.VISIBLE);
            plus_point.setY((float) Math.floor(Math.random() * (screen_hight - plus_point.getHeight() - up - down)) + up);
            plus_point.setX((float) Math.floor(Math.random() * (screen_width - plus_point.getWidth())));
            key=3;
        }

        if (key==2) {
            plus_time.setVisibility(View.VISIBLE);
            plus_time.setY((float) Math.floor(Math.random() * (screen_hight - plus_time.getHeight() - up - down)) + up);
            plus_time.setX((float) Math.floor(Math.random() * (screen_width - plus_time.getWidth())));
            key=3;
        }

        if(key==3) {
            timer_plus++;
            if(timer_plus==100){
                timer_plus=0;
                key=0;
                plus_time.setVisibility(View.INVISIBLE);
                plus_point.setVisibility(View.INVISIBLE);
            }
        }

        show_addition();





    }

    public void show_addition(){

        if (key2==1){
            pt_txt.setTranslationX(plus_point.getTranslationX());
            pt_txt.setTranslationY(plus_point.getTranslationY());
            pt_txt.setX(plus_point.getX());
            pt_txt.setY(plus_point.getY());
            pt_txt.setVisibility(View.VISIBLE);
            key2=3;
        }

        if (key2==2){
            tim_txt.setTranslationX(plus_time.getTranslationX());
            tim_txt.setTranslationY(plus_time.getTranslationY());
            tim_txt.setX(plus_time.getX());
            tim_txt.setY(plus_time.getY());
            tim_txt.setVisibility(View.VISIBLE);
            key2=3;
        }
        if(key2==3) {
            timer_plus2++;
            if(timer_plus2==100){
                timer_plus2=0;
                key2=0;
                tim_txt.setVisibility(View.INVISIBLE);
                pt_txt.setVisibility(View.INVISIBLE);
            }
        }
    }

    public void add_time(View view) {
        time+=20000;
        key2=2;
        plus_time.setVisibility(View.INVISIBLE);
    }

    public void plus (View view) {
        Gold+=100;
        test=Gold;
        key2=1;
        plus_point.setVisibility(View.INVISIBLE);
    }

    public void new_levels(){

        int  go_rr[][]={{img1_1,img2_1,img3_1,img4_1,img5_1,img1_2,img2_2,img3_2,img4_2,img5_2},
                {img11_1,img12_1,img13_1,img14_1,img15_1,img11_2,img12_2,img13_2,img14_2,img15_2}};

        if(Gold>test){
            go= (go==1)? 2:1;
            rr_new = roo.nextInt(10) + 1;
            fish.setBackgroundResource(go_rr[go-1][rr_new-1]);
        }
        on=0;
        on3=0;
        test=Gold;

        if (go==1) {
            if (rr_new == 1)
                img1(2);
            if (rr_new == 2)
                img2(1);
            if (rr_new == 3)
                img3(1);
            if (rr_new == 4)
                img4(1);
            if (rr_new == 5)
                img5(1);

            if (rr_new == 6)
                img1(2);
            if (rr_new == 7)
                img2(2);
            if (rr_new == 8)
                img3(2);
            if (rr_new == 9)
                img4(2);
            if (rr_new == 10)
                img5(2);

        }
        check();

        if (go==2) {

            if (rr_new == 1)
                img11(1);
            if (rr_new == 2)
                img12(1);
            if (rr_new == 3)
                img13(1);
            if (rr_new == 4)
                img14(1);
            if (rr_new == 5)
                img15(1);

            if (rr_new == 6)
                img11(2);
            if (rr_new == 7)
                img12(2);
            if (rr_new == 8)
                img13(2);
            if (rr_new == 9)
                img14(2);
            if (rr_new == 10)
                img15(2);

        }
        check3();
    }

   // public void check_all(){}

    public void hook1(View view) {
        hook1.setBackgroundResource(R.color.light);
        hook2.setBackgroundResource(0);
        hook3.setBackgroundResource(0);
        fish.setBackgroundResource(R.drawable.hook1);
        number=1;
    }

    public void hook2(View view) {
        hook2.setBackgroundResource(R.color.light);
        hook1.setBackgroundResource(0);
        hook3.setBackgroundResource(0);
        fish.setBackgroundResource(R.drawable.hook2);
        number=2;
    }

    public void hook3(View view) {
        hook3.setBackgroundResource(R.color.light);
        hook1.setBackgroundResource(0);
        hook2.setBackgroundResource(0);
        fish.setBackgroundResource(R.drawable.hook3);
        number=3;
    }

    public void stoop(View view) {



        stop=0;

        AlertDialog.Builder sms = new AlertDialog.Builder(this);
        sms.setMessage(R.string.sms2_1 )
                .setIcon(R.drawable.stop)
                .setTitle("")
                .setPositiveButton(R.string.sms2_3, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        stop=1;
                    }
                })

                .setNegativeButton(R.string.sms2_4, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        back();
                    }
                })
                .show();

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        stop=0;

        AlertDialog.Builder sms = new AlertDialog.Builder(this);
        sms.setMessage(R.string.sms2_1 )
                .setIcon(R.drawable.stop)
                .setTitle("")
                .setPositiveButton(R.string.sms2_3, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        stop=1;
                    }
                })

                .setNegativeButton(R.string.sms2_4, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        back();
                    }
                })
                .show();

    }

    public void back(){

        Intent go = new Intent(this, face.class);
        go.putExtra("sms", chose);
        startActivity(go);
        finish();
    }


}
