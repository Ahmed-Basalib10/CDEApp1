package com.e.cdeapp.activities;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.e.cdeapp.R;
import com.e.cdeapp.databinding.FragmentLoginBinding;


public class LoginFragment extends Fragment {
    FragmentLoginBinding fragmentLoginBinding;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentLoginBinding = FragmentLoginBinding.inflate(getLayoutInflater());
        // Inflate the layout for this fragment
        fragmentLoginBinding.textInputEdittext.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                int color = b ? ContextCompat.getColor(getContext(),R.color.purple_500) : Color.GRAY;
                fragmentLoginBinding.textInputLayout.setStartIconTintList(ColorStateList.valueOf(color));
            }
        });
        fragmentLoginBinding.textInputEdittext1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                int color = b ? ContextCompat.getColor(getContext(),R.color.purple_500) : Color.GRAY;
                fragmentLoginBinding.textInputLayout1.setStartIconTintList(ColorStateList.valueOf(color));
            }
        });

        return fragmentLoginBinding.getRoot();


    }
}