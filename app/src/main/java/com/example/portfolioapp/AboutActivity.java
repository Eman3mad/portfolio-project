package com.example.portfolioapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.portfolioapp.databinding.ActivityAboutBinding;

public class AboutActivity extends AppCompatActivity {
ActivityAboutBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ActivityAboutBinding.inflate(getLayoutInflater()).getRoot());
         binding.btnBack.setOnClickListener(v -> finish());
    }
}