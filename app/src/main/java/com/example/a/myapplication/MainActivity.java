package com.example.a.myapplication;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button btn=(Button)findViewById(R.id.id1);
            Button btn2=(Button)findViewById(R.id.id2);
        Button btn3=(Button)findViewById(R.id.id3);
            btn.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this,Twoactivity.class);
                    startActivity(intent);
                }
            });
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,threeTwoactivity.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,fouracitivity.class);
                startActivity(intent);
            }
        });
    }



}
