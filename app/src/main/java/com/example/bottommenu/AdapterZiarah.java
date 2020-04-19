package com.example.bottommenu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterZiarah extends RecyclerView.Adapter<HolderIhram> {

    Context context;
    ArrayList<ModelIhram> ihramModel;
    public AdapterZiarah(Context context, ArrayList<ModelIhram> ihramModel) {
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
                if (ihramModel.get(position).getTitle().equals("Keutamaan Kota Mekah")) {
                    Intent jelas = new Intent(context, bKeutamaanMekah.class);
                    context.startActivity(jelas);
                }
                /* if (ihramModel.get(position).getTitle().equals("Masjidil Haram")) {
                    Intent in = new Intent(context, bMasjidilHaram.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Ka'bah")) {
                    Intent jelas = new Intent(context, bKabah.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("Mina")) {
                    Intent in = new Intent(context, bMina.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Arofah")) {
                    Intent jelas = new Intent(context, bArafah.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("Muzdalifah")) {
                    Intent in = new Intent(context, bMuzdalifah.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("Gua Hira")) {
                    Intent jelas = new Intent(context, bHira.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("Gua At-tsaur")) {
                    Intent in = new Intent(context, bTsur.class);
                    context.startActivity(in);
                } */

            }
        });

    }


    @Override
    public int getItemCount() {
        return ihramModel.size();
    }
}
