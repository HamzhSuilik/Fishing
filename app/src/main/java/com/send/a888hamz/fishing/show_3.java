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
import android.widget.Button;
import android.widget.TextView;

public class show_3 extends AppCompatActivity {

    private int i;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_3);

        // resize text
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        WindowManager wm = getWindowManager();
        Display dp = wm.getDefaultDisplay();
        Point size = new Point();
        dp.getSize(size);
        float ratio = (size.x/480);

        TextView tt =(TextView)findViewById(R.id.txt);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 4.5f*ratio);

        tt =(Button)findViewById(R.id.button3);
        tt.setTextSize(TypedValue.COMPLEX_UNIT_MM, 8f*ratio);

        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

        // reserve sms

        Bundle paste = getIntent().getExtras();
        i = paste.getInt("sms");

        //   change text

        txt=(TextView)findViewById(R.id.txt);

        if(i>5){
            txt.setText(R.string.show3_1);
        }else{
            txt.setText(R.string.show3_2);
        }

    }

    public void goo(View view) {
        Intent go = new Intent(this,level1.class);
        go.putExtra("sms",i);
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
