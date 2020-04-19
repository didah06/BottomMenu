package com.example.bottommenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class menupersiapan11 extends AppCompatActivity {

    Toolbar toolbar;
    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hakikat_talbiyah);
        toolbar = findViewById(R.id.toolbar);
        btn1 = findViewById(R.id.bukhari1549);
        btn2 = findViewById(R.id.muslim1184);
        //hadist belum ditemukan
        btn3 = findViewById(R.id.ahmad16567);
        btn4 = findViewById(R.id.ibnumajah2922);
        btn5 = findViewById(R.id.abudawud1814);
        btn6 = findViewById(R.id.tirmidzi829);
        //hadist belum ditemukan
        btn7 = findViewById(R.id.annasaai2753);
        btn8 = findViewById(R.id.muslim1247);
        //hadist belum ditemukan
        btn9 = findViewById(R.id.thabrani);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(menupersiapan11.this);
                dialog.setContentView(R.layout.hadits26);
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
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(menupersiapan11.this);
                dialog.setContentView(R.layout.hadist30);
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
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(menupersiapan11.this);
                dialog.setContentView(R.layout.hadist31);
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
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(menupersiapan11.this);
                dialog.setContentView(R.layout.hadist32);
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
