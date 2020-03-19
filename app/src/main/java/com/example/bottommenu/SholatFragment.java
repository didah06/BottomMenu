package com.example.bottommenu;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

public class SholatFragment extends Fragment {
    public static final int REQUEST_LOCATION = 1;
    LocationManager locationManager;
    TextView mLocationTv;
    Geocoder geocoder;
    List<Address> addresses;
    String city;

    String url;
    TextView mFajrTv, mDhuhrTv, mAsrTv, mMaghribTv, mIsyaTv, mDateTv;
    ProgressDialog pDialog;
    String tag_json_obj = "json_obj_req";
    private static final String TAG = "tag";
    String longitude, latitude;
    Fragment fragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sholat, container, false);

        mLocationTv = view.findViewById(R.id.locationTv);
        mFajrTv = view.findViewById(R.id.txtSubuh);
        mDhuhrTv = view.findViewById(R.id.txtDzuhur);
        mAsrTv = view.findViewById(R.id.txtAshar);
        mMaghribTv = view.findViewById(R.id.txtMaghrib);
        mIsyaTv = view.findViewById(R.id.txtIsya);
        mDateTv = view.findViewById(R.id.dateTv);


        ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);
        return view;

    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        getLocation();
    }


    private void getLocation() {
        locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
        if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            buildAlertMesssageNoGps();

        } else if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            if ((ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission
                    (getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)) {
                ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);
            } else {
                Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                if (location != null) {
                    geocoder = new Geocoder(getActivity());
                    double latt = location.getLatitude();
                    double longi = location.getLongitude();
                    latitude = String.valueOf(latt);
                    longitude = String.valueOf(longi);

                    try {
                        addresses = geocoder.getFromLocation(latt, longi, 1);
                        city = addresses.get(0).getLocality();
                        mLocationTv.setText(String.valueOf(city));
                        url = "https://muslimsalat.com/" + city + ".json?key=5fe91155ab8498eb43bd3aae6755c72c";
                        searchLoc();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private void searchLoc() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
                url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            //get date
                            String date = response.getJSONArray("items").getJSONObject(0).get("date_for").toString();

                            //get timming
                            String txtSubuh = response.getJSONArray("items").getJSONObject(0).get("fajr").toString();
                            String txtDzuhur = response.getJSONArray("items").getJSONObject(0).get("dhuhr").toString();
                            String txtAshar = response.getJSONArray("items").getJSONObject(0).get("asr").toString();
                            String txtMaghrib = response.getJSONArray("items").getJSONObject(0).get("maghrib").toString();
                            String txtIsya = response.getJSONArray("items").getJSONObject(0).get("isha").toString();
                            mFajrTv.setText(txtSubuh);
                            mDhuhrTv.setText(txtDzuhur);
                            mAsrTv.setText(txtAshar);
                            mMaghribTv.setText(txtMaghrib);
                            mIsyaTv.setText(txtIsya);
                            mDateTv.setText(date);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                Toast.makeText(getActivity(), "error", Toast.LENGTH_SHORT).show();

            }
        });
        AppController.getInstance().addToRequestQueue(jsonObjectRequest, tag_json_obj);
    }

    private void buildAlertMesssageNoGps() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Please Turn ON your GPS Connection")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(final DialogInterface dialog, final int id) {
                        startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(final DialogInterface dialog, final int id) {
                        dialog.cancel();
                    }
                });
        final AlertDialog alert = builder.create();
        alert.show();
    }

}