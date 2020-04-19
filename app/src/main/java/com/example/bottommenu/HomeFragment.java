package com.example.bottommenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class HomeFragment extends Fragment implements View.OnClickListener{

    Button button;
    ImageView img;

    CardView persiapan, umroh, haji, lokasi;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        TextView Date = view.findViewById(R.id.textdate);
        Date.setText(currentDate);

        button = (Button) view.findViewById(R.id.btn_lokasi);
        Intent mySecondIntent = getActivity().getIntent();
        String stringIWantToGet = mySecondIntent.getStringExtra("city");

        button.setText(stringIWantToGet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MapsActivity.class);
                startActivity(intent);
            }
        });
        persiapan = view.findViewById(R.id.crdpersiapan);
        persiapan.setOnClickListener(this);
        umroh = view.findViewById(R.id.crdfiqihumroh);
        umroh.setOnClickListener(this);
        haji = view.findViewById(R.id.crdfqhhj);
        haji.setOnClickListener(this);
        lokasi = view.findViewById(R.id.crdlokasi);
        lokasi.setOnClickListener(this);

        /*cardView1 = view.findViewById(R.id.cardView1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity(), menupersiapan.class);
                startActivity(intent1);
            }
        });
        cardView2 = view.findViewById(R.id.cardView3);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity(), fiqihumrah.class);
                startActivity(intent2);
            }
        });
        cardView3 = view.findViewById(R.id.cardView3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity(), TabActivity.class);
                startActivity(intent2);
            }
        });
        cardView3 = view.findViewById(R.id.cardView3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity(), lokasi_ziarah.class);
                startActivity(intent2);
            }
        });*/



        return view;
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.crdpersiapan:
                Intent persiap = new Intent(getActivity(), menupersiapan.class);
                startActivity(persiap);
                break;
            case R.id.crdfiqihumroh:
                Intent fhaj = new Intent(getActivity(), fiqihumrah.class);
                startActivity(fhaj);
                break;
            case R.id.crdfqhhj:
                Intent fum = new Intent(getActivity(), TabActivity.class);
                startActivity(fum);
                break;
            case R.id.crdlokasi:
                Intent lks = new Intent(getActivity(), lokasi_ziarah.class);
                startActivity(lks);
        }
    }

    //ADD PLAYERS TO ARRAYLIST

}
