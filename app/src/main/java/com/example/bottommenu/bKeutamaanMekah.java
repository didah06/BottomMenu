package com.example.bottommenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class bKeutamaanMekah extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    Button btn1, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keutamaanmekkah);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("lokasi ziarah");
        btn1 = findViewById(R.id.bukhari104);
        btn2 = findViewById(R.id.muslim1354);
        btn3 = findViewById(R.id.asysyura7);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bukhari104:
                final Dialog dialog10 = new Dialog(bKeutamaanMekah.this);
                dialog10.setContentView(R.layout.hadits33);

                ImageButton closeButton10 = dialog10.findViewById(R.id.close15);
                closeButton10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog10.dismiss();
                    }
                });

                dialog10.show();
                break;
            case R.id.muslim1354:
                final Dialog dialog1 = new Dialog(bKeutamaanMekah.this);
                dialog1.setContentView(R.layout.hadits34);

                ImageButton closeButton1 = dialog1.findViewById(R.id.close15);
                closeButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog1.dismiss();
                    }
                });

                dialog1.show();
                break;
            case R.id.asysyura7:
                final Dialog dialog2 = new Dialog(bKeutamaanMekah.this);
                dialog2.setContentView(R.layout.hadits35);

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
