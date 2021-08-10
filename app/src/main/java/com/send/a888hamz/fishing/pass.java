package com.send.a888hamz.fishing;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class pass extends AppCompatActivity {

    private int chose;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);

        // corunt level
        //*************************************************

        SharedPreferences gg = getSharedPreferences("level", Context.MODE_PRIVATE);
        num=gg.getInt("level",1);

        //****************************************************

        // resize text
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        WindowManager wm = getWindowManager();
        Display dp = wm.getDefaultDisplay();
        Point size = new Point();
        dp.getSize(size);
        float ratio = (size.x/480);



        TextView tt =(TextView)findViewById(R.id.textView4);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 5*ratio);

        tt =(TextView)findViewById(R.id.q);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 4*ratio);


        tt =(TextView)findViewById(R.id.q15);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 4*ratio);

        tt =(TextView)findViewById(R.id.q12);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 4*ratio);



        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1){
                getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            }


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
            Intent go = new Intent(this,show2.class);
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

    public void nee (View view) {

        if (chose==15){

            Intent go = new Intent(this, face.class);
            startActivity(go);
            finish();

        }else {

            if (chose < 10) {


                if (num == 5) {
                    Intent go = new Intent(this, show_3.class);
                    go.putExtra("sms", chose + 1);
                    startActivity(go);
                    finish();
                }

                Intent go = new Intent(this, level1.class);
                go.putExtra("sms", chose + 1);
                startActivity(go);
                finish();
            } else {


                if (num == 10) {

                    chose -= 10;

                    Intent go = new Intent(this, show1.class);
                    go.putExtra("sms", chose + 1);
                    startActivity(go);
                    finish();

                } else {

                    chose -= 10;

                    Intent go = new Intent(this, show2.class);
                    go.putExtra("sms", chose + 1);
                    startActivity(go);
                    finish();
                }
            }
        }
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();

    }

}
