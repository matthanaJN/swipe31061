package com.example.lenovo.mapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Swipe();

    }

    public void Swipe(){
        RelativeLayout Rel2= findViewById(R.id.main2);
        Rel2.setOnTouchListener(new swipe(this){

            @Override
            public void onSwipeRight() {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

}
