package com.example.bottommenu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterSai extends RecyclerView.Adapter<HolderIhram> {
    Context context;
    ArrayList<ModelIhram> ihramModel;
    public adapterSai(Context context, ArrayList<ModelIhram> ihramModel) {
        this.context = context;
        this.ihramModel = ihramModel;
    }

    @NonNull
    @Override
    public HolderIhram onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null);
        return new HolderIhram(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderIhram holder, int position) {
        holder.mtitle.setText(ihramModel.get(position).getTitle());
        holder.imageView.setImageResource(ihramModel.get(position).getImg());

        holder.setClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                if (ihramModel.get(position).getTitle().equals("Sejarah")) {
                    Intent jelas = new Intent(context, sejarahSai.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("Hukum-hukum")) {
                    Intent in = new Intent(context, hukumSai.class);
                    context.startActivity(in);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return ihramModel.size();
    }
}
