package com.example.bottommenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class menupersiapan6 extends AppCompatActivity {

    Button btn1,btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meneladani_nabi);
        btn1 = findViewById(R.id.bukhari1605);
        btn2 = findViewById(R.id.muslim1270);
        btn3 = findViewById(R.id.bukhari1579);
        btn4 = findViewById(R.id.muslim1297);
        btn5 = findViewById(R.id.annawawi);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(menupersiapan6.this);
                dialog.setContentView(R.layout.hadits17);

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
                final Dialog dialog = new Dialog(menupersiapan6.this);
                dialog.setContentView(R.layout.hadits18);

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
                final Dialog dialog = new Dialog(menupersiapan6.this);
                dialog.setContentView(R.layout.hadits19);

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
                final Dialog dialog = new Dialog(menupersiapan6.this);
                dialog.setContentView(R.layout.hadits20);

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
