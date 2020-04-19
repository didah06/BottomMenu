package com.example.bottommenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class menupersiapan8 extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hindari_maksiat);
        btn1 = findViewById(R.id.albaqarah197);
        btn2 = findViewById(R.id.bukhari1521);
        btn3 = findViewById(R.id.ibnuhazm);
        btn4 = findViewById(R.id.fatawaa);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(menupersiapan8.this);
                dialog.setContentView(R.layout.hadits21);

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
                final Dialog dialog = new Dialog(menupersiapan8.this);
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

    }
}
