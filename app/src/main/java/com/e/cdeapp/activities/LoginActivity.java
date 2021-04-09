package com.e.cdeapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.e.cdeapp.R;
import com.e.cdeapp.adapters.FragmentAdapter;
import com.e.cdeapp.databinding.ActivityLoginBinding;


public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding loginBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(loginBinding.getRoot());

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Login Page");
            getSupportActionBar().setElevation(0);
        }

        FragmentAdapter fragmentAdapter=new FragmentAdapter(getSupportFragmentManager(),loginBinding.tabLayout.getTabCount());
        fragmentAdapter.addFragment(new LoginFragment(),"Admin Login");
        fragmentAdapter.addFragment(new SignUpFragment(),"Intern Login");
        loginBinding.viewpager.setAdapter(fragmentAdapter);
        loginBinding.tabLayout.setupWithViewPager(loginBinding.viewpager);
    }
}