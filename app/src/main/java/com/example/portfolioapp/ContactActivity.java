package com.example.portfolioapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.portfolioapp.databinding.ActivityContactBinding;

public class ContactActivity extends AppCompatActivity {
ActivityContactBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityContactBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message =binding.contactMessageEt.getText().toString();
                Toast.makeText(ContactActivity.this, " Message was Sent ",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}