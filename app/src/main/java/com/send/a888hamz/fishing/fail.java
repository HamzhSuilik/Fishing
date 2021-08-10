package com.send.a888hamz.fishing;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class fail extends AppCompatActivity {

    private int chose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail);


        // resize text
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        WindowManager wm = getWindowManager();
        Display dp = wm.getDefaultDisplay();
        Point size = new Point();
        dp.getSize(size);
        float ratio = (size.x/480);


        TextView tt =(TextView)findViewById(R.id.textView6);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

         tt =(TextView)findViewById(R.id.q15);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 4*ratio);

         tt =(TextView)findViewById(R.id.q12);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 4*ratio);

        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


        Bundle paste = getIntent().getExtras();
        chose = paste.getInt("sms");

    }


    public void goo(View view) {

        if(chose<11) {
            Intent go = new Intent(this, level1.class);
            go.putExtra("sms", chose);
            startActivity(go);
            finish();
        }
        else{
            chose-=10;
            Intent go = new Intent(this, show2.class);
            go.putExtra("sms", chose);
            startActivity(go);
            finish();
        }

    }

    public void hoo(View view) {
        Intent intent = new Intent(getApplicationContext(),face.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();

    }



}


