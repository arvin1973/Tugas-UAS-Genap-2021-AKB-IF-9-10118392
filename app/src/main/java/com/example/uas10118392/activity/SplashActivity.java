package com.example.uas10118392.activity;
/*
 * Tanggal pengerjaan : 5 Agustus 2021
 * Nim                : 10118392
 * Nama               : Raden Arvin Rizky A
 * Kelas              : IF-9
 * */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.uas10118392.R;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashActivity.this, InfoActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}