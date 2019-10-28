package br.com.digitalhouse.treinandomvvm.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import br.com.digitalhouse.treinandomvvm.R;

//Todo: 4º Criado .view.SplashActivity.class

public class SplashActivity extends AppCompatActivity {

    private Timer timer = new Timer();
    private LinearLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        background = findViewById(R.id.background_splash);
        background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump();
            }
        });

        timer.schedule(new TimerTask() {


            @Override
            public void run() {
                jump();
            }
        },4000);

    }

    private void jump() {
        timer.cancel();
        startActivity(new Intent(SplashActivity.this,HomeActivity.class));
        finish();
    }
}
