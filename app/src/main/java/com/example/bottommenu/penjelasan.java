package com.example.bottommenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class penjelasan extends AppCompatActivity {
    Toolbar toolbar;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.haji_penjelasan);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("fiqih haji");
        btn1 = findViewById(R.id.albaqarah196);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(penjelasan.this);
                dialog.setContentView(R.layout.hadist13);
                ImageButton closeButton3 = dialog.findViewById(R.id.close15);
                closeButton3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }
}
