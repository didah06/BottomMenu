package com.example.bottommenu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterHaji extends RecyclerView.Adapter<HolderIhram> {
    Context context;
    ArrayList<ModelIhram> ihramModel;
    public AdapterHaji(Context context, ArrayList<ModelIhram> ihramModel) {
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
                if (ihramModel.get(position).getTitle().equals("Penjelasan")) {
                    Intent jelas = new Intent(context, penjelasan.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("Umroh")) {
                    Intent in = new Intent(context, fiqihumrah.class);
                    context.startActivity(in);
                }
                /*if (ihramModel.get(position).getTitle().equals("Menetap")) {
                    Intent in = new Intent(context, hMenetap.class);
                    context.startActivity(in);
                }*/
                if (ihramModel.get(position).getTitle().equals("Pelaksanaan")) {
                    Intent in = new Intent(context, hPelaksanaan.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Thawaf Wada")) {
                    Intent in = new Intent(context, hThawaf.class);
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
