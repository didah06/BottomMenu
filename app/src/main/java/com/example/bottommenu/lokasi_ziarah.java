package com.example.bottommenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class lokasi_ziarah extends AppCompatActivity implements View.OnClickListener {
    RecyclerView mrecyclerView;
    AdapterZiarah adapterZiarah;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi_ziarah);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("lokasi ziarah");

        mrecyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = (new LinearLayoutManager(this));
        mrecyclerView.setLayoutManager(layoutManager);

        adapterZiarah = new AdapterZiarah(this, getMyList());
        mrecyclerView.setAdapter(adapterZiarah);
        // Inflate the layout for this fragment

        mrecyclerView.setOnClickListener(this);
    }

    private ArrayList<ModelIhram> getMyList() {
        ArrayList<ModelIhram> models = new ArrayList<>();

        ModelIhram model = new ModelIhram();
        model.setTitle("Keutamaan Kota Mekah");
        model.setImg(R.mipmap.keutamaanmekah);
        models.add(model);

       /* model = new ModelIhram();
        model.setTitle("Masjidil Haram");
        model.setImg(R.mipmap.lokasi_masjidharom);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Ka'bah");
        model.setImg(R.mipmap.lokasi_kabah);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Mina");
        model.setImg(R.mipmap.lokasi_mina);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Arofah");
        model.setImg(R.mipmap.lokasi_arafah);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Muzdalifah");
        model.setImg(R.mipmap.lokasi_muzdalifah);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Gua Hira");
        model.setImg(R.mipmap.lokasi_hira);
        models.add(model);

        model = new ModelIhram();
        model.setTitle("Gua At-tsaur");
        model.setImg(R.mipmap.lokasi_tsur);
        models.add(model); */


        return models;
    }

    @Override
    public void onClick(View view) {

    }
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.search){
            startActivity(new Intent(this, Searchview.class));
        }
        return true;
    }
    }
