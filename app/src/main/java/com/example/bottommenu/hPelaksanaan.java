package com.example.bottommenu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class hPelaksanaan extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.haji_pelaksanaan);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("fiqih haji");
    }
}
