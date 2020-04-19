package com.example.bottommenu;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView titleini;
    private ItemClickListener itemClickListener;

    public ViewHolder(View view) {
        super(view);
        this.titleini= itemView.findViewById(R.id.text_penjelas);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClickListener(itemView, getLayoutPosition());

    }
    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;
    }
}
