package com.example.lenovo.mapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    Name name;

    private DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Swipe();


    }

    public void Swipe(){

        RelativeLayout Rel =findViewById(R.id.main1);
        Rel.setOnTouchListener(new swipe(this){

            @Override
            public void onSwipeBottom() {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }

            @Override
            public void onSwipeLeft() {
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }

        });


    }
}
