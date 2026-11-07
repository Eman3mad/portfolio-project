package com.example.portfolioapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfolioapp.databinding.ItemBlogBinding;

import java.util.ArrayList;

public class BlogAdapter extends RecyclerView.Adapter<BlogAdapter.ViewHolder> {

    ArrayList<String> posts;

    public BlogAdapter(ArrayList<String> posts) {
        this.posts = posts;
    }

    @NonNull

    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemBlogBinding binding = ItemBlogBinding.inflate(

                LayoutInflater.from(parent.getContext()), parent, false);

        return new ViewHolder(binding);

    }

    @Override

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.tvBlogTitle.setText(posts.get(position));

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemBlogBinding binding;
        public ViewHolder(ItemBlogBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }

}