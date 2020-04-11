package com.example.assignment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class TrendingAdapter extends RecyclerView.Adapter<TrendingAdapter.ViewHolder>{
    private post[] posts;

    // RecyclerView recyclerView;
    public TrendingAdapter(post[] posts) {
        this.posts = posts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.trending_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final post post = posts[position];
        holder.tags.setText(post.getTag());
        holder.nearby.setText(post.getNearby());
    }


    @Override
    public int getItemCount() {
        return posts.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tags,nearby;
        public ViewHolder(View itemView) {
            super(itemView);
            tags=itemView.findViewById(R.id.tags);
            nearby=itemView.findViewById(R.id.nearby);
        }
    }
}
