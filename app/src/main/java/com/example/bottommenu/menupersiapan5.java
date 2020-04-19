package com.example.bottommenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class menupersiapan5 extends AppCompatActivity{

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ikhlas);
        //tidak menemukan hadist
        btn1 = findViewById(R.id.ashahihah2617);
        btn2 = findViewById(R.id.bukhari1521);
        btn3 = findViewById(R.id.muslim1350);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(menupersiapan5.this);
                dialog.setContentView(R.layout.hadist15);

                ImageButton closeButton = dialog.findViewById(R.id.close15);
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(menupersiapan5.this);
                dialog.setContentView(R.layout.hadits16);

                ImageButton closeButton = dialog.findViewById(R.id.close15);
                closeButton.setOnClickListener(new View.OnClickListener() {
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
