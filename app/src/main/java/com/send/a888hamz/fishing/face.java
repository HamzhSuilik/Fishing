package com.send.a888hamz.fishing;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Point;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class face extends AppCompatActivity {


    // LEVEL

    private int num;
    private TextView txt;
    private int [] name;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face);



        // resize text
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        WindowManager wm = getWindowManager();
        Display dp = wm.getDefaultDisplay();
        Point size = new Point();
        dp.getSize(size);
        float ratio = (size.x/480);


        TextView tt =(TextView)findViewById(R.id.textView7);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 4.5f*ratio);





        tt =(TextView) findViewById(R.id.q1);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q2);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q3);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q4);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q5);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q6);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q7);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q8);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q9);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q10);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q11);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q12);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q13);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q14);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);

        tt =(TextView) findViewById(R.id.q15);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 7*ratio);


        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@



        // save amd load

        SharedPreferences gg = getSharedPreferences("level", Context.MODE_PRIVATE);
        num=gg.getInt("level",1);

        // level

        int[]name={0,R.id.q1,R.id.q2,R.id.q3,R.id.q4,R.id.q5,R.id.q6,R.id.q7,R.id.q8,R.id.q9,R.id.q10,
                R.id.q11,R.id.q12,R.id.q13,R.id.q14,R.id.q15};



        for (int i=1;i<16;i++){
            txt=(TextView)findViewById(name[i]);
            txt.setText(String.valueOf(i));
            if (i<num)
                txt.setBackgroundResource(R.drawable.level_1);
            if (i==num) {
                txt.setBackgroundResource(R.drawable.level_2);
                txt.setTextColor(Color.BLACK);
            }
            if (i>num) {
                txt.setBackgroundResource(R.drawable.loak);
                txt.setText("");}
        }




    }

    public void save(int num2){
        SharedPreferences gg = getSharedPreferences("level", Context.MODE_PRIVATE);
        SharedPreferences.Editor copy = gg.edit();
        copy.putInt("level",num2);
        copy.apply();

    }

    public void q1(View view) { check1(1);}
    public void q2(View view) {
        check1(2);
    }
    public void q3(View view) {
        check1(3);
    }
    public void q4(View view) {
        check1(4);
    }
    public void q5(View view) {
        check1(5);
    }
    public void q6(View view) {
        check1(6);
    }
    public void q7(View view) {
        check1(7);
    }
    public void q8(View view) {
        check1(8);
    }
    public void q9(View view) {
        check1(9);
    }
    public void q10(View view) { check1(10);}
    public void q11(View view) {
        check3(1);
    }
    public void q12(View view) {
        check3(2);
    }
    public void q13(View view) {
        check3(3);
    }
    public void q14(View view) {
        check3(4);
    }
    public void q15(View view) {
        check3(5);
    }




    public void check1(int i){
        if (num>=i){
            Intent go = new Intent(this,show_3.class);
            go.putExtra("sms",i);
            startActivity(go);
            finish();

        }else {
            Toast sms= Toast.makeText(this,R.string.loak,Toast.LENGTH_SHORT);
            View color = sms.getView();
            color.setBackgroundColor(Color.RED);
            sms.show();
        }

    }

    public void check2(int i){
        if (num>=i){
            Intent go = new Intent(this,level_plus.class);
            go.putExtra("sms",i);
            startActivity(go);
            finish();

        }else {
            Toast sms= Toast.makeText(this,R.string.sms3,Toast.LENGTH_SHORT);
            View color = sms.getView();
            color.setBackgroundColor(Color.RED);
            sms.show();
        }

    }

    public void check3 (int i ) {

        if (num>=(i+10)){
            Intent go = new Intent(this,show1.class);
            go.putExtra("sms",i);
            startActivity(go);
            finish();

        }else {
            Toast sms= Toast.makeText(this,R.string.sms3,Toast.LENGTH_SHORT);
            View color = sms.getView();
            color.setBackgroundColor(Color.RED);
            sms.show();
        }

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
