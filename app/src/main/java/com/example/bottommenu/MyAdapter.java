package com.example.bottommenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder>{

    ArrayList<Model> arrayList;

    public MyAdapter(ArrayList<Model> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);
        return new MyHolder(view);
    }


    @Override
    public  void onBindViewHolder(MyHolder viewHolder, int position) {
        viewHolder.textView.setText(arrayList.get(position).getTitle());
        viewHolder.imageView.setImageResource(arrayList.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

    /*ArrayList<Model> models;

    public MyAdapter(ArrayList<Model> models) {
        this.models= models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.textView.setText(models.get(position).getTitle());
        holder.imageView.setImageResource(models.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}*/
