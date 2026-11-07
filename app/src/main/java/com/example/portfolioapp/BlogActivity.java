package com.example.portfolioapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.portfolioapp.databinding.ActivityBlogBinding;

import java.util.ArrayList;
import java.util.List;

public class BlogActivity extends AppCompatActivity {
ActivityBlogBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding=ActivityBlogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rvBlog.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<String> posts = new ArrayList<>();
        posts.add("1. About me ");
        posts.add("2. my skills");
        posts.add("3. my projects");

binding.rvBlog.setAdapter(new BlogAdapter(posts));
    }
}