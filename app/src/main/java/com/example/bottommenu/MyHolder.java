package com.example.bottommenu;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.imageView = itemView.findViewById(R.id.image);
        this.textView = itemView.findViewById(R.id.title);

    }
}
