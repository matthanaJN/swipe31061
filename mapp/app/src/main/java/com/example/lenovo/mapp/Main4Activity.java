package com.example.lenovo.mapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Swipe();

    }

    public void  Swipe(){

        RelativeLayout Rel4 = findViewById(R.id.main4);
        Rel4.setOnTouchListener(new swipe(this){

            @Override
            public void onSwipeLeft() {
                Intent intent = new Intent(Main4Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
