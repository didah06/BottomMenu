package com.example.bottommenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class hThawaf extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    Button btn1, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.thawaf);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("fiqih haji");
        btn1 = findViewById(R.id.bukhari1755);
        btn2 = findViewById(R.id.muslim1328);
        btn3 = findViewById(R.id.mulsim1327);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bukhari1755:
                final Dialog dialog = new Dialog(hThawaf.this);
                dialog.setContentView(R.layout.hadist18);

                ImageButton closeButton3 = dialog.findViewById(R.id.close15);
                closeButton3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
                break;
            case R.id.muslim1328:
                final Dialog dialog1 = new Dialog(hThawaf.this);
                dialog1.setContentView(R.layout.hadist16);

                ImageButton closeButton1 = dialog1.findViewById(R.id.close15);
                closeButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog1.dismiss();
                    }
                });

                dialog1.show();
                break;
            case R.id.mulsim1327:
                final Dialog dialog2 = new Dialog(hThawaf.this);
                dialog2.setContentView(R.layout.hadist17);
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
