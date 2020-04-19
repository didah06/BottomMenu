package com.example.bottommenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class sejarahSai extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.sejarahsai);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("sai");
        btn1 = findViewById(R.id.albaqarah158);
        btn2 = findViewById(R.id.muslim1218);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.albaqarah158:
                final Dialog dialog = new Dialog(sejarahSai.this);
                dialog.setContentView(R.layout.hadist22);
                ImageButton closeButton3 = dialog.findViewById(R.id.close15);
                closeButton3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
                break;
            case R.id.muslim1218:
                final Dialog dialog1 = new Dialog(sejarahSai.this);
                dialog1.setContentView(R.layout.hadist23);
                ImageButton closeButton1 = dialog1.findViewById(R.id.close15);
                closeButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog1.dismiss();
                    }
                });

                dialog1.show();
                break;
        }

    }
}
