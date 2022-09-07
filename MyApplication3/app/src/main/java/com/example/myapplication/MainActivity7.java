package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Button name = findViewById(R.id.button6);
        Button name1= findViewById(R.id.button4);
        Button name2= findViewById(R.id.button7);




        name2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uiui = new Intent(MainActivity7.this,MainActivity8.class);
                startActivity(uiui);

            }
        });

      name.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

          }
      });



        name.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent dbhw = new Intent(MainActivity7.this,MainActivity11.class);

             startActivity(dbhw);
         }
     });
    }
}