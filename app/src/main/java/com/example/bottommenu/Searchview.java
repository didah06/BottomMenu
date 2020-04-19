package com.example.bottommenu;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Searchview extends AppCompatActivity {
    private RecyclerView rv;
    private RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchview);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //sv= (SearchView) findViewById(R.id.mSearch);
        rv= (RecyclerView) findViewById(R.id.list_item);
        //SET ITS PROPERTIES
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());
        //ADAPTER
        adapter=new RecyclerViewAdapter(this,getModel());
        rv.setAdapter(adapter);

    }


    //ADD PLAYERS TO ARRAYLIST
    private ArrayList<ModelIhram> getModel() {
        ArrayList<ModelIhram> model=new ArrayList<>();
        ModelIhram p=new ModelIhram();
        p.setTitle("persiapan haji");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("fiqih umrah");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("fiqih haji");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("lokasi ziarah");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("keutamaan haji");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("jamaah haji tamu Allah");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("segeralah jadi tamu Allah");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("bersabarlah");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("ikhlas");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("meneladani nabi");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("jangan berdebat");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("jangan maksiat agar mabrur");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("berhaji dengan harta yang halal");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("mencari teman perjalanan yang baik");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("hakikat talbiyah");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("ihram di miqot");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("thowaf");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("maqom ibarahim");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("minum zamzam");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("sai");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("gundul/cukur pendek");
        model.add(p);

        p=new ModelIhram();
        p.setTitle("keutamaan kota mekkah");
        model.add(p);


        return model;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /*getMenuInflater().inflate( R.menu.optionmenu, menu);
        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) searchItem.getActionView();*/
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
    }

