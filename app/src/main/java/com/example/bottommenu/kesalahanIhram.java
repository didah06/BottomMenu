package com.example.bottommenu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class kesalahanIhram extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesalahanihram);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("ihram dan miqot");
    }
}
