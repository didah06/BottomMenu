package com.example.bottommenu;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Haji1 extends Fragment implements View.OnClickListener {
    RecyclerView mrecyclerView;
    AdapterHaji adapterHaji;


    private Haji1.OnFragmentInteractionListener mListener;

    public Haji1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.haji_tamattu, container, false);

        mrecyclerView = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = (new LinearLayoutManager(getActivity()));
        mrecyclerView.setLayoutManager(layoutManager);

        adapterHaji = new AdapterHaji(getActivity(), getMyList());
        mrecyclerView.setAdapter(adapterHaji);
        // Inflate the layout for this fragment

        mrecyclerView.setOnClickListener(this);
        return view;
    }

    private ArrayList<ModelIhram> getMyList() {
        ArrayList<ModelIhram> models = new ArrayList<>();

        ModelIhram model1 = new ModelIhram();
        model1.setTitle("Penjelasan");
        model1.setImg(R.mipmap.penjelasanhaji);
        models.add(model1);

        model1 = new ModelIhram();
        model1.setTitle("Umroh");
        model1.setImg(R.mipmap.umrohhaji);
        models.add(model1);

        model1 = new ModelIhram();
        model1.setTitle("Pelaksanaan");
        model1.setImg(R.mipmap.pelaksanaanhaji);
        models.add(model1);

        model1 = new ModelIhram();
        model1.setTitle("Thawaf Wada");
        model1.setImg(R.mipmap.thawafwada);
        models.add(model1);

        return models;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Haji1.OnFragmentInteractionListener) {
            mListener = (Haji1.OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View view) {

    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
