package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        Button ere = findViewById(R.id.button15);
        Button ghgh = findViewById(R.id.button14);
        Button opo = findViewById(R.id.button17);
        Button plplj=findViewById(R.id.button16);
        Button uyru=findViewById(R.id.button18);
        Button ggfe=findViewById(R.id.button19);

        ere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1QFwA2tEYqoGZ3TDHqIUi2st6qmanYQJH/view"));
                startActivity(browserIntent);


            }
        });


        ghgh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hjhj = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1N14SJG2vJwQ6XTgQmL18RNKIabfa402u/view"));
                startActivity(hjhj);

            }
        });



     opo.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent ppokj = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1nbzlFORsOgSH98Od2o35GPCNrRiqk0xv/view"));
             startActivity(ppokj);
         }
     });


    plplj.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent kjkh = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vylvGQVNS9oQAyzX9QTxcpHsJGztO9yd/view"));
            startActivity(kjkh);

        }
    });

      uyru.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent hghv = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1CC-3q2JwnE82TUUJeShN7bFYi_FJnPqa/view"));
              startActivity(hghv);

          }
      });

     ggfe.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent hghv = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ix7PPxFTUxKuVZmtKUDDcd1Q0OyWHRLh/view"));
             startActivity(hghv);
         }
     });






    }
}