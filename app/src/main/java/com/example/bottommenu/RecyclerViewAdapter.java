package com.example.bottommenu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class RecyclerViewAdapter extends RecyclerView.Adapter<HolderIhram> implements Filterable {
    Context context;
    ArrayList<ModelIhram> ihramModel;
    private List<ModelIhram> filterList;
    CustomFilter filter;

    public RecyclerViewAdapter(Context context, ArrayList<ModelIhram> ihramModel) {
        this.context = context;
        this.ihramModel = ihramModel;
        this.filterList = ihramModel;
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
                if (ihramModel.get(position).getTitle().equals("persiapan haji")) {
                    Intent jelas = new Intent(context, menupersiapan.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("fiqih umrah")) {
                    Intent in = new Intent(context, fiqihumrah.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("fiqih haji")) {
                    Intent in = new Intent(context, TabActivity.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("lokasi ziarah")) {
                    Intent in = new Intent(context, lokasi_ziarah.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("keutamaan haji")) {
                    Intent jelas = new Intent(context, WelcomeActivity.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("jamaah haji tamu Allah")) {
                    Intent in = new Intent(context, PredikatTamu.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("segeralah jadi tamu Allah")) {
                    Intent in = new Intent(context, menupersiapan3.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("bersabarlah")) {
                    Intent in = new Intent(context, menupersiapan4.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("ikhlas")) {
                    Intent jelas = new Intent(context, menupersiapan5.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("meneladani nabi")) {
                    Intent in = new Intent(context, menupersiapan6.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("jangan berdebat")) {
                    Intent in = new Intent(context, menupersiapan7.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("jangan maksiat agar mabrur")) {
                    Intent in = new Intent(context, menupersiapan8.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("berhaji dengan harta yang halal")) {
                    Intent jelas = new Intent(context, menupersiapan9.class);
                    context.startActivity(jelas);
                }
                if (ihramModel.get(position).getTitle().equals("mencari teman perjalanan yang baik")) {
                    Intent in = new Intent(context, menupersiapan10.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("hakikat talbiyah")) {
                    Intent in = new Intent(context, menupersiapan11.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("ihram di miqot")) {
                    Intent in = new Intent(context, IhramMiqat.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("thowaf")) {
                    Intent in = new Intent(context, Thowaf.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("maqom ibrahim")) {
                    Intent in = new Intent(context, MaqomIbrahim.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("minum zamzam")) {
                    Intent in = new Intent(context, MinumZamzam.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("sai")) {
                    Intent in = new Intent(context, Sai.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("gundul/cukur pendek")) {
                    Intent in = new Intent(context, Gundul.class);
                    context.startActivity(in);
                }
                if (ihramModel.get(position).getTitle().equals("keutamaan kota mekkah")) {
                    Intent in = new Intent(context, lokasi_ziarah.class);
                    context.startActivity(in);
                }



            }
        });

    }

    @Override
    public int getItemCount() {
        return ihramModel.size();
    }
    public CustomFilter getFilter() {
        if(filter==null)
        {
            filter=new CustomFilter(filterList,this);
        }
        return filter;
    }

}
