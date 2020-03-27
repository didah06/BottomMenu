package com.example.bottommenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KesehatanFragment extends Fragment {

    /*RecyclerView recyclerView;
    MyAdapter myAdapter;
    ArrayList<Model> models;*/


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kesehatan, container, false);
        return view;

        /*recyclerView = view.findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        myAdapter = new MyAdapter(getModels(), getActivity());
        recyclerView.setAdapter(myAdapter);

        return view;

    }
    private ArrayList<Model> getModels() {
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

        return models;


    }*/
    }

}
