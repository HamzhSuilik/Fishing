package com.send.a888hamz.fishing;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.net.URI;


public class go extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);


        // resize text
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        WindowManager wm = getWindowManager();
        Display dp = wm.getDefaultDisplay();
        Point size = new Point();
        dp.getSize(size);
        float ratio = (size.x/480);




        Button tt =(Button)findViewById(R.id.button8);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 4f*ratio);

        tt =(Button)findViewById(R.id.button9);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 4f*ratio);

        tt =(Button)findViewById(R.id.button10);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 4f*ratio);


        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        AdView mAdView = (AdView)findViewById(R.id.adView6);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // InterstitialAd

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                Intent intent = new Intent(getApplicationContext(),face.class);
                startActivity(intent);
                finish();

                mInterstitialAd.loadAd(new AdRequest.Builder().build());

            }

        });




    }

    public void goo(View view) {
            Intent intent = new Intent(getApplicationContext(), face.class);
            startActivity(intent);
            finish();
    }

    public void ads(View view) {

        Intent intent = new Intent(getApplicationContext(),steps.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        AlertDialog.Builder sms = new AlertDialog.Builder(this);
        sms.setMessage(R.string.sms1_1)
                .setIcon(R.drawable.common_google_signin_btn_icon_dark)
                .setTitle("")
                .setPositiveButton(R.string.sms1_2, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       finish();
                    }
                })

                .setNegativeButton(R.string.sms1_3, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .show();
    }

    public void exit(View view) {

        AlertDialog.Builder sms = new AlertDialog.Builder(this);
        sms.setMessage(R.string.sms1_1)
                .setIcon(R.drawable.common_google_signin_btn_icon_dark)
                .setTitle("")
                .setPositiveButton(R.string.sms1_2, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })

                .setNegativeButton(R.string.sms1_3, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .show();
    }

    public void star(View view) {


        Intent star5 =new Intent(Intent.ACTION_VIEW);
        star5.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.send.a888hamz.fishing"));
        startActivity(star5);

    }
}
