package com.example.bottommenu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterThowaf extends RecyclerView.Adapter<HolderIhram>{
    Context context;
    ArrayList<ModelIhram> ihramModel;
    public adapterThowaf(Context context, ArrayList<ModelIhram> ihramModel) {
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
                if (ihramModel.get(position).getTitle().equals("Keutamaan")) {
                    Intent jelas = new Intent(context, keutamaanThawaf.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("Macam-macam")) {
                    Intent in = new Intent(context, macamThawaf.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Syarat-syarat")) {
                    Intent in = new Intent(context, syaratThawaf.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Sunnah-sunnah")) {
                    Intent in = new Intent(context, sunahThawaf.class);
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
