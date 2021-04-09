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
import com.e.cdeapp.databinding.FragmentSignUpBinding;


public class SignUpFragment extends Fragment {
    FragmentSignUpBinding signUpBinding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        signUpBinding = FragmentSignUpBinding.inflate(getLayoutInflater());

        signUpBinding.textInputEdittext5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                int color = b ? ContextCompat.getColor(getContext(),R.color.purple_500) : Color.GRAY;
                signUpBinding.textInputLayout5.setStartIconTintList(ColorStateList.valueOf(color));
            }
        });
        signUpBinding.textInputEdittext6.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                int color = b ? ContextCompat.getColor(getContext(),R.color.purple_500) : Color.GRAY;
                signUpBinding.textInputLayout6.setStartIconTintList(ColorStateList.valueOf(color));
            }
        });
        // Inflate the layout for this fragment
        return signUpBinding.getRoot();
    }
}