package com.example.songbird.animalappjava;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

class PhotoViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    public PhotoViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView = (ImageView) itemView;
    }

    public void bind(Photo photo) {
        Glide.with(imageView.getContext())
                .load(photo)
                .into(imageView);
    }
}
