package com.example.amrizalns.backind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread t = new Thread(){
            @Override
            public void run() {
                super.run();
                try{
                    sleep(3000);
                    Intent i = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(i);
                    finish();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}
