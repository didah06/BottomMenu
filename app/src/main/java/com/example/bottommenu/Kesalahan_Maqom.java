package com.example.bottommenu;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

class Kesalahan_Maqom extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesalahanmaqom);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("maqom ibrahim");
    }
}
