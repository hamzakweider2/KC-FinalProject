package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

         Button jkjk = findViewById(R.id.button);

         jkjk.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent fbahf = new Intent(MainActivity4.this,MainActivity7.class);
        startActivity(fbahf);  }
         });

    }
}