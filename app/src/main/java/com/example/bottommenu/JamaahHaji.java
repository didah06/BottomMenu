package com.example.bottommenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class JamaahHaji extends AppCompatActivity {
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamaah_haji);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("persiapan haji");
    }
}
