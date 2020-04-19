package com.example.bottommenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class fiqihumrah extends AppCompatActivity implements View.OnClickListener{

    CardView fqumrah1, fqumrah2, fqumrah3, fqumrah4, fqumrah5, fqumrah6;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiqihumrah);
        toolbar =  findViewById(R.id.toolbar);
        toolbar.setTitle("fiqih umrah");
        fqumrah1 = findViewById(R.id.btnfq1);
        fqumrah1.setOnClickListener(this);
        fqumrah2 = findViewById(R.id.btnfq2);
        fqumrah2.setOnClickListener(this);
        fqumrah3 = findViewById(R.id.btnfq3);
        fqumrah3.setOnClickListener(this);
        fqumrah4 = findViewById(R.id.btnfq4);
        fqumrah4.setOnClickListener(this);
        fqumrah5 = findViewById(R.id.btnfq5);
        fqumrah5.setOnClickListener(this);
        fqumrah6 = findViewById(R.id.btnfq6);
        fqumrah6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnfq1:
                Intent persiap = new Intent(this, IhramMiqat.class);
                startActivity(persiap);
                break;
            case R.id.btnfq2:
                Intent fhaj = new Intent(this, Thowaf.class);
                startActivity(fhaj);
                break;
            case R.id.btnfq3:
                Intent fum = new Intent(this, MaqomIbrahim.class);
                startActivity(fum);
                break;
            case R.id.btnfq4:
                Intent lks = new Intent(this, MinumZamzam.class);
                startActivity(lks);
                break;
            case R.id.btnfq5:
                Intent ikhlas = new Intent(this, Sai.class);
                startActivity(ikhlas);
                break;
            case R.id.btnfq6:
                Intent nabi = new Intent(this, Gundul.class);
                startActivity(nabi);

        }

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
