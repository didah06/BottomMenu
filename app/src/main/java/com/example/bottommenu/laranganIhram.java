package com.example.bottommenu;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class laranganIhram extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    Button btn1, btn2, btn3, btn4, btn5,btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laranganihram);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("ihram dan miqot");
        btn1 = findViewById(R.id.albaqarah196);
        btn2 = findViewById(R.id.alhajj29);
        btn3 = findViewById(R.id.bukhari5803);
        btn4 = findViewById(R.id.bukhari1593);
        btn5 = findViewById(R.id.muslim2040);
        btn6 = findViewById(R.id.bukhari1842);
        btn7 = findViewById(R.id.muslim1171);
        btn8 = findViewById(R.id.bukhari1842_kedua);
        btn9 = findViewById(R.id.muslim1177);
        btn10 = findViewById(R.id.bukhari1838);
        btn11 = findViewById(R.id.almaidah96);
        btn12 = findViewById(R.id.almaidah95);
        btn13 = findViewById(R.id.albaqarah197);
        btn14 = findViewById(R.id.muslim1409);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.albaqarah196:
                final Dialog dialog = new Dialog(laranganIhram.this);
                dialog.setContentView(R.layout.hadist13);
                ImageButton closeButton3 = dialog.findViewById(R.id.close15);
                closeButton3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
                break;
            case R.id.alhajj29:
                final Dialog dialog1 = new Dialog(laranganIhram.this);
                dialog1.setContentView(R.layout.hadist35);
                ImageButton closeButton1 = dialog1.findViewById(R.id.close15);
                closeButton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog1.dismiss();
                    }
                });

                dialog1.show();
                break;
            case R.id.bukhari5803:
                final Dialog dialog2 = new Dialog(laranganIhram.this);
                dialog2.setContentView(R.layout.hadist36);
                ImageButton closeButton2 = dialog2.findViewById(R.id.close15);
                closeButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog2.dismiss();
                    }
                });

                dialog2.show();
                break;
            case R.id.bukhari1539:
                final Dialog dialog3 = new Dialog(laranganIhram.this);
                dialog3.setContentView(R.layout.hadist10);
                ImageButton closeButton4 = dialog3.findViewById(R.id.close15);
                closeButton4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog3.dismiss();
                    }
                });

                dialog3.show();
                break;
            case R.id.muslim2040:
                final Dialog dialog4 = new Dialog(laranganIhram.this);
                dialog4.setContentView(R.layout.hadist37);
                ImageButton closeButton5 = dialog4.findViewById(R.id.close15);
                closeButton5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog4.dismiss();
                    }
                });

                dialog4.show();
                break;
            case R.id.bukhari1842:
                final Dialog dialog5 = new Dialog(laranganIhram.this);
                dialog5.setContentView(R.layout.hadist38);
                ImageButton closeButton6 = dialog5.findViewById(R.id.close15);
                closeButton6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog5.dismiss();
                    }
                });

                dialog5.show();
                break;
            /*case R.id.muslim1171:
                final Dialog dialog6 = new Dialog(laranganIhram.this);
                dialog6.setContentView(R.layout.hadist39);
                ImageButton closeButton7 = dialog6.findViewById(R.id.close15);
                closeButton7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog6.dismiss();
                    }
                });

                dialog6.show();
                break;*/
            case R.id.bukhari1842_kedua:
                final Dialog dialog7 = new Dialog(laranganIhram.this);
                dialog7.setContentView(R.layout.hadist38);
                ImageButton closeButton8 = dialog7.findViewById(R.id.close15);
                closeButton8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog7.dismiss();
                    }
                });

                dialog7.show();
                break;
            case R.id.bukhari1838:
                final Dialog dialog8 = new Dialog(laranganIhram.this);
                dialog8.setContentView(R.layout.hadist39);
                ImageButton closeButton9 = dialog8.findViewById(R.id.close15);
                closeButton9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog8.dismiss();
                    }
                });

                dialog8.show();
                break;
            case R.id.almaidah96:
                final Dialog dialog9 = new Dialog(laranganIhram.this);
                dialog9.setContentView(R.layout.hadist40);
                ImageButton closeButton10 = dialog9.findViewById(R.id.close15);
                closeButton10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog9.dismiss();
                    }
                });

                dialog9.show();
                break;
            case R.id.almaidah95:
                final Dialog dialog10 = new Dialog(laranganIhram.this);
                dialog10.setContentView(R.layout.hadist41);
                ImageButton closeButton11 = dialog10.findViewById(R.id.close15);
                closeButton11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog10.dismiss();
                    }
                });

                dialog10.show();
                break;
            case R.id.albaqarah197:
                final Dialog dialog11 = new Dialog(laranganIhram.this);
                dialog11.setContentView(R.layout.hadist42);
                ImageButton closeButton12 = dialog11.findViewById(R.id.close15);
                closeButton12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog11.dismiss();
                    }
                });

                dialog11.show();
                break;
            case R.id.muslim1409:
                final Dialog dialog12 = new Dialog(laranganIhram.this);
                dialog12.setContentView(R.layout.hadist43);
                ImageButton closeButton13 = dialog12.findViewById(R.id.close15);
                closeButton13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog12.dismiss();
                    }
                });

                dialog12.show();
                break;

        }
    }
}
