package com.example.bottommenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MinumZamzam extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    Button btn1, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minumzamzam);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("minum zamzam");
        btn1 = findViewById(R.id.muslim2473);
        btn2 = findViewById(R.id.alhajj27_28);
        btn3 = findViewById(R.id.muslim2473_2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.muslim2473:
                final Dialog dialog = new Dialog(MinumZamzam.this);
                dialog.setContentView(R.layout.hadist24);
                ImageButton closeButton3 = dialog.findViewById(R.id.close15);
                closeButton3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
                break;
            case R.id.alhajj27_28:
                final Dialog dialog1 = new Dialog(MinumZamzam.this);
                dialog1.setContentView(R.layout.hadist25);
                ImageButton closeButton1 = dialog1.findViewById(R.id.close15);
                closeButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog1.dismiss();
                    }
                });

                dialog1.show();
                break;
            case R.id.muslim2473_2:
                final Dialog dialog2 = new Dialog(MinumZamzam.this);
                dialog2.setContentView(R.layout.hadist24);
                ImageButton closeButton2 = dialog2.findViewById(R.id.close15);
                closeButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog2.dismiss();
                    }
                });

                dialog2.show();
                break;
        }
    }
}
