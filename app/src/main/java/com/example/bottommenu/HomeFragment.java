package com.example.bottommenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    Button button;
    ImageView img;
    Toolbar toolbar;
    CardView cardView1, cardView2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.home_toolbar));
        button = (Button) view.findViewById(R.id.btn_lokasi);
        Intent mySecondIntent = getActivity().getIntent();
        String stringIWantToGet = mySecondIntent.getStringExtra("city");
        button.setText(stringIWantToGet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MapsActivity.class);
                startActivity(intent);
            }
        });
        cardView1 = view.findViewById(R.id.card1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity(), WelcomeActivity.class);
                startActivity(intent1);
            }
        });
        cardView2 = view.findViewById(R.id.card2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity(), TabActivity.class);
                startActivity(intent2);
            }
        });
        return view;
    }
}
