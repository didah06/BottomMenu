package com.example.bottommenu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

class ApaMaqomIbrahim extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apamaqomibrahim);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("maqom ibrahim");
    }
}
