package com.rahmatsyah.rimedia.view.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.rahmatsyah.rimedia.R;
import com.rahmatsyah.rimedia.model.Post;
import com.rahmatsyah.rimedia.utils.GlideApp;

import java.util.ArrayList;

public class HomePostAdapter extends RecyclerView.Adapter<HomePostAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Post> posts;

    public HomePostAdapter(Context context, ArrayList<Post> posts) {
        this.context = context;
        this.posts = posts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.view_item_home_post,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GlideApp.with(context).load(posts.get(position).getImage()).into(holder.postImage);
        GlideApp.with(context).load(posts.get(position).getImage()).into(holder.postBackground);
        holder.postImage.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView postImage, postBackground;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            postImage = itemView.findViewById(R.id.ivPostHome);
            postBackground = itemView.findViewById(R.id.ivPostBackgroundHome);
        }
    }
}
