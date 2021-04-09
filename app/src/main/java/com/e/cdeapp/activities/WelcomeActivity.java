package com.e.cdeapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;

import com.e.cdeapp.R;
import com.e.cdeapp.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends AppCompatActivity {
    ActivityWelcomeBinding welcomeBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        welcomeBinding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(welcomeBinding.getRoot());
        
        welcomeBinding.welcomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(WelcomeActivity.this,MainActivity.class));
                overridePendingTransition(R.anim.slide_uo_in,R.anim.slide_up_out);
            }
        });
    }

    private void animations() {
        welcomeBinding.welecomImage.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.usersanim));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


            }
        },400);
    }
}