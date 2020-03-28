package com.example.petsitters;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
/*
 * <Splash screen> ‐ <Actividad para pantalla de carga>
 *
 * written by: <Team 7 Marshmallow>
 * <Instituto tecnologico de chihuahua II>
 * <Petsitter>
 * <25/03/2020>
 */
public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, Welcome.class);
                startActivity(intent);
            }
        }, 3000);
    }
}
