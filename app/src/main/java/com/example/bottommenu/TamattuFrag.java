package com.example.bottommenu;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TamattuFrag extends Fragment {

    View view;
    RecyclerView recyclerView;
    ArrayList<Model> arrayList;
    Context context;

    String name[] = {"penjelasan", "umroh", "umroh", "menetap", "pelaksanaan", "thawaf"};
    int image[] = {R.drawable.penjelasan, R.drawable.umroh, R.drawable.menetap, R.drawable.pelaksanaan, R.drawable.thawaf};
    MyAdapter myAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tamattu, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        arrayList = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            Model model = new Model();
            model.setTitle(name[i]);
            model.setImg(image[i]);

            //add in array list
            arrayList.add(model);
        }

        myAdapter = new MyAdapter(arrayList);
        recyclerView.setAdapter(myAdapter);
        return view;
    }
}

        /*recyclerView = view.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        myAdapter = new MyAdapter(getModels());
        recyclerView.setAdapter(myAdapter);
        /*recyclerView.setLayoutManager(layoutManager);
        myAdapter = new MyAdapter(getModels(), getActivity());
        recyclerView.setAdapter(myAdapter);
        return view;
    }




}



    /*private ArrayList<Model> getModels() {
        ArrayList<Model> models = new ArrayList<>();

        Model model = new Model();
        model.setTitle("penjelasan");
        model.setImg(R.drawable.penjelasan);
        models.add(model);

        model = new Model();
        model.setTitle("Umroh");
        model.setImg(R.drawable.umroh);
        models.add(model);

        model = new Model();
        model.setTitle("Menetap di Mekkah");
        model.setImg(R.drawable.menetap);
        models.add(model);

        model = new Model();
        model.setTitle("Pelaksanaan Haji");
        model.setImg(R.drawable.pelaksanaan);
        models.add(model);

        model = new Model();
        model.setTitle("Thowaf Wada");
        model.setImg(R.drawable.thawaf);
        models.add(model);

        return models;*/


