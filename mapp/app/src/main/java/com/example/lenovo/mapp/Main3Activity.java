package com.example.lenovo.mapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Swipe();
    }

    public void Swipe(){

        RelativeLayout Rel3 = findViewById(R.id.main3);
        Rel3.setOnTouchListener(new swipe(this){

            @Override
            public void onSwipeRight() {
                Intent intent = new Intent(Main3Activity.this,MainActivity.class);
                startActivity(intent);
            }

            @Override
            public void onSwipeTop() {
                Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });
    }
}
