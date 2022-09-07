package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        Button gdjf = findViewById( R.id.button20);
        Button dgefu = findViewById(R.id.button21);
        Button fgeyg = findViewById(R.id.button25);
        Button ewryw = findViewById(R.id.button26);
        Button wrygv = findViewById(R.id.button27);

        gdjf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kdgfv = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1BhO_IAIYKVHBnyDkIyW42s3b0UExuCpH/view"));
                startActivity(kdgfv);
            }
        });
     dgefu.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent bfhvq = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Fe1029E0yLl1C440UvRobuNaj2KlSAY1/view"));
             startActivity(bfhvq);
         }
     });
     fgeyg.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent ghuh = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VTlE2EXHrGgb2oQQJgCXJVXMDa-tmFbO/view"));
             startActivity(ghuh);
         }
     });
    ewryw.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent fbhjf = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ppS9mFDuo6qwLlIXn9urQThc8Atl_sa3/view"));
           startActivity(fbhjf);
        }
    });
    wrygv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent fbfvbh = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1yVYP01WPdWbqSgpG0M6Wbjj0bFtu8UFU/view"));
              startActivity(fbfvbh);
        }
    });
    }
}