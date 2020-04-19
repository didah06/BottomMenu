package com.example.bottommenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class keutamaanThawaf extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keutamaanthawaf);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("thawaf");
        btn1 = findViewById(R.id.albaqarah125);
        btn2 = findViewById(R.id.alhajj26);
        btn3 = findViewById(R.id.tirmidzi959);
        btn4 = findViewById(R.id.tirmidzi960);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.albaqarah125:
                final Dialog dialog = new Dialog(keutamaanThawaf.this);
                dialog.setContentView(R.layout.hadist27);
                ImageButton closeButton3 = dialog.findViewById(R.id.close15);
                closeButton3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
                break;
            case R.id.alhajj26:
                final Dialog dialog1 = new Dialog(keutamaanThawaf.this);
                dialog1.setContentView(R.layout.hadist29);
                ImageButton closeButton1 = dialog1.findViewById(R.id.close15);
                closeButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog1.dismiss();
                    }
                });

                dialog1.show();
                break;
            case R.id.tirmidzi959:
                final Dialog dialog2 = new Dialog(keutamaanThawaf.this);
                dialog2.setContentView(R.layout.hadist33);
                ImageButton closeButton2 = dialog2.findViewById(R.id.close15);
                closeButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog2.dismiss();
                    }
                });

                dialog2.show();
                break;
            case R.id.tirmidzi960:
                final Dialog dialog3 = new Dialog(keutamaanThawaf.this);
                dialog3.setContentView(R.layout.hadist34);
                ImageButton closeButton4 = dialog3.findViewById(R.id.close15);
                closeButton4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog3.dismiss();
                    }
                });

                dialog3.show();
                break;
        }
    }
}
