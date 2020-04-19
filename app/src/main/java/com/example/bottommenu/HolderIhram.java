package com.example.bottommenu;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class HolderIhram extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView imageView;
    TextView mtitle;
    private ItemClickListener clickListener;

    HolderIhram(@NonNull View itemView) {
        super(itemView);

        this.imageView = itemView.findViewById(R.id.image);
        this.mtitle = itemView.findViewById(R.id.title);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.clickListener.onItemClickListener(view, getLayoutPosition());
    }

    public void setClickListener(ItemClickListener ic){
        this.clickListener = ic;
    }
}
