package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button yuyu = findViewById(R.id.button2);
        Button hhjhj = findViewById(R.id.button5);


        yuyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hamza = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(hamza);

            }
        });


        hhjhj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asas = new Intent(MainActivity.this,MainActivity5.class);
                startActivity(asas);

            }
        });








    }
}