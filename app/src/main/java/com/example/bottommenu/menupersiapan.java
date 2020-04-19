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

public class menupersiapan extends AppCompatActivity implements View.OnClickListener{


    Toolbar toolbar;
    CardView keutamaan, jamaah, tamu, bersabar, ikhlas, nabi, berdebat, maksiat,
            harta, teman, hakikat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupersiapan);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("persiapan haji");
       keutamaan = findViewById(R.id.keutamaan);
       keutamaan.setOnClickListener(this);
       jamaah = findViewById(R.id.jamaah);
       jamaah.setOnClickListener(this);
       tamu = findViewById(R.id.tamu);
       tamu.setOnClickListener(this);
       bersabar = findViewById(R.id.sabar);
       bersabar.setOnClickListener(this);
       ikhlas = findViewById(R.id.ikhlas);
       ikhlas.setOnClickListener(this);
       nabi = findViewById(R.id.nabi);
       nabi.setOnClickListener(this);
       berdebat = findViewById(R.id.berdebat);
       berdebat.setOnClickListener(this);
       maksiat = findViewById(R.id.maksiat);
       maksiat.setOnClickListener(this);
       harta = findViewById(R.id.hartahalal);
       harta.setOnClickListener(this);
       teman = findViewById(R.id.teman);
       teman.setOnClickListener(this);
       hakikat = findViewById(R.id.hakikat);
       hakikat.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.keutamaan:
                Intent persiap = new Intent(this, WelcomeActivity.class);
                startActivity(persiap);
                break;
            case R.id.jamaah:
                Intent fhaj = new Intent(this, PredikatTamu.class);
                startActivity(fhaj);
                break;
            case R.id.tamu:
                Intent fum = new Intent(this, menupersiapan3.class);
                startActivity(fum);
                break;
            case R.id.sabar:
                Intent lks = new Intent(this, menupersiapan4.class);
                startActivity(lks);
                break;
            case R.id.ikhlas:
                Intent ikhlas = new Intent(this, menupersiapan5.class);
                startActivity(ikhlas);
                break;
            case R.id.nabi:
                Intent nabi = new Intent(this, menupersiapan6.class);
                startActivity(nabi);
                break;
            case R.id.berdebat:
                Intent berdebat = new Intent(this, menupersiapan7.class);
                startActivity(berdebat);
                break;
            case R.id.maksiat:
                Intent maksiat = new Intent(this, menupersiapan8.class);
                startActivity(maksiat);
                break;
            case R.id.hartahalal:
                Intent harta = new Intent(this, menupersiapan9.class);
                startActivity(harta);
                break;
            case R.id.teman:
                Intent teman = new Intent(this, menupersiapan10.class);
                startActivity(teman);
                break;
            case R.id.hakikat:
                Intent hakikat = new Intent(this, menupersiapan11.class);
                startActivity(hakikat);

        }

    }

}
