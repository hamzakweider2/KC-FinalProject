package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        Button gdhga = findViewById(R.id.button8);





        gdhga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jgdcag = new Intent(MainActivity11.this,MainActivity12.class);
                startActivity(jgdcag);
            }
        });

    }
}