package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

       Button uuuu = findViewById(R.id.button3);

        uuuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klklk = new Intent (MainActivity5.this,MainActivity7.class);

                startActivity(klklk);

            }
        });




    }
}