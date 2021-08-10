package com.send.a888hamz.fishing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class add_try extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_try);

        AdView mAdView = (AdView)findViewById(R.id.adView5);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




    }
}
