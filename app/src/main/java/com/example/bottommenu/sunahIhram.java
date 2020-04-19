package com.example.bottommenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class sunahIhram extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunahihram);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("ihram dan miqat");
        btn1 = findViewById(R.id.bukhari1539);
        btn2 = findViewById(R.id.muslim2040);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bukhari1539:
                final Dialog dialog3 = new Dialog(sunahIhram.this);
                dialog3.setContentView(R.layout.hadist10);
                ImageButton closeButton4 = dialog3.findViewById(R.id.close15);
                closeButton4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog3.dismiss();
                    }
                });

                dialog3.show();
                break;
            case R.id.muslim2040:
                final Dialog dialog4 = new Dialog(sunahIhram.this);
                dialog4.setContentView(R.layout.hadist37);
                ImageButton closeButton5 = dialog4.findViewById(R.id.close15);
                closeButton5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog4.dismiss();
                    }
                });

                dialog4.show();
                break;
        }
    }
}
