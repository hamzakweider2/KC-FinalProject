package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Button nmnm = findViewById(R.id.button10);
        Button mnmn = findViewById(R.id.button9);
        Button hhg = findViewById(R.id.button12);
        Button hvh = findViewById(R.id.button11);

        nmnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klk = new Intent(MainActivity8.this,MainActivity10.class);
                startActivity(klk);

            }
        });


    }
}