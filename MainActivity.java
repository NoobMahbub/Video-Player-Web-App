package com.techhelpbd.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.videoUrl = "https://www.youtube.com/embed/C_KmdNQpDAc?autoplay=1";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.videoUrl = "https://www.youtube.com/embed/CxN0oHJtTzE?auoplay=1";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.videoUrl = "https://www.youtube.com/embed/eaRbdH7vhB0?autoplay=1";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);

            }
        });


    }
}
