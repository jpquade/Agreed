package com.example.jer.agreed2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    private TextView text6;
    private TextView text7;
    private ImageView image6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        text6 = (TextView) findViewById(R.id.textView6);
        text7 = (TextView) findViewById(R.id.textView7);
        image6 = (ImageView) findViewById(R.id.imageView6);
        Animation splashanim = AnimationUtils.loadAnimation(this,R.anim.welcometransition);
        text6.startAnimation(splashanim);
        text7.startAnimation(splashanim);
        image6.startAnimation(splashanim);
        final Intent i = new Intent(this, Homepage.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally{
                    startActivity(i);
                    finish();
                }
            }
        };
                timer.start();
    }
}
