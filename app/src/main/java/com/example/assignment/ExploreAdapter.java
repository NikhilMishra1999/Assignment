package com.example.assignment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ViewHolder>{
    private explorepost[] posts;

    // RecyclerView recyclerView;
    public ExploreAdapter(explorepost[] posts) {
        this.posts = posts;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.explore_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final explorepost post = posts[position];
        holder.tagss.setText(post.getTags());
        holder.name.setText(post.getName());
        holder.place.setText(post.getPlace());
        holder.desc.setText(post.getDesc());
        holder.img.setImageResource(post.getImgId());
    }


    @Override
    public int getItemCount() {
        return posts.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,place,desc,tagss;
        ImageView img;
        public ViewHolder(View itemView) {
            super(itemView);
            tagss=itemView.findViewById(R.id.tagss);
            name=itemView.findViewById(R.id.name);
            desc=itemView.findViewById(R.id.desciption);
            place=itemView.findViewById(R.id.place);
            img=itemView.findViewById(R.id.imageView);
        }
    }
}
