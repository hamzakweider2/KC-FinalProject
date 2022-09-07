package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Button ggh = findViewById(R.id.button13);


        ggh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gygy =new Intent(MainActivity9.this,MainActivity.class);
                startActivity(gygy);

            }
        });


    }
}