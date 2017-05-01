package com.example.amrizalns.backind.fragments;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.amrizalns.backind.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by amrizalns on 3/29/17.
 */

public class Fragment_dashboard extends Fragment implements OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks
,GoogleApiClient.OnConnectionFailedListener, LocationListener{
    private GoogleMap mMap;
    private MapView mapView;
    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

// 1      viewPager = (ViewPager) view.findViewById(R.id.viewPager);
//        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getActivity());
//        viewPager.setAdapter(viewPagerAdapter);
//
//        Timer timer = new Timer();
//        timer.scheduleAtFixedRate(new myTimerTask(), 4000, 5000);
        ImageView imageViewHotel = (ImageView) view.findViewById(R.id.menu_hotel);
        imageViewHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_hotel hotel = new Fragment_hotel();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container,hotel);
                fragmentTransaction.commit();

//                Toast.makeText(getContext(), "Clicked ", Toast.LENGTH_LONG).show();

            }
        });

        ImageView imageViewKuliner = (ImageView) view.findViewById(R.id.menu_foods);
        imageViewKuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_kuliner hotel = new Fragment_kuliner();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container,hotel);
                fragmentTransaction.commit();

//                Toast.makeText(getContext(), "Clicked ", Toast.LENGTH_LONG).show();

            }
        });


        Button btnComment = (Button) view.findViewById(R.id.btn_comment);
        btnComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(), Fragment_cs.class);
//                startActivity(intent);
                Fragment_cs cs = new Fragment_cs();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.main_container,cs);
                fragmentTransaction.commit();
            }
        });

        ImageButton btnMap = (ImageButton) view.findViewById(R.id.btn_search);
        final EditText search = (EditText) view.findViewById(R.id.txt_search);

        btnMap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String addressString = search.getText().toString();
                Uri geoLocation = Uri.parse("geo:0,0?q=" + addressString);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(geoLocation);
                startActivity(intent);


            }
        });

//        PlaceAutocompleteFragment autocompleteFragment = (PlaceAutocompleteFragment)
//                getFragmentManager().findFragmentById(R.id.place_autocomplete_fragment);
//
//        autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
//            @Override
//            public void onPlaceSelected(Place place) {
//                // TODO: Get info about the selected place.
//                Log.i(TAG, "Place: " + place.getName());
//            }
//
//            @Override
//            public void onError(Status status) {
//                // TODO: Handle the error.
//                Log.i(TAG, "An error occurred: " + status);
//            }
//        });

        return view;
    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }
// 2   @Override
//    public void onViewCreated(View view, Bundle savedInstanceState) {
//        mapView = (MapView) view.findViewById(R.id.maps);
//        mapView.onCreate(savedInstanceState);
//        mapView.onResume();
//        mapView.getMapAsync(this);
//
//    }

//    public class myTimerTask extends TimerTask {
//        @Override
//        public void run() {
//            getActivity().runOnUiThread(new Runnable() {
//                @Override
//                public void run() {
//                    if(viewPager.getCurrentItem() == 0){
//                        viewPager.setCurrentItem(1);
//                    }else if(viewPager.getCurrentItem() == 1){
//                        viewPager.setCurrentItem(2);
//                    }else {
//                        viewPager.setCurrentItem(0);
//                    }
//                }
//            });
//        }
//    }

    public static class ImageAdapter extends BaseAdapter {
        private Context mContext;

        public ImageAdapter(Context context){
            mContext = context;
        }

        @Override
        public int getCount() {
            return 0;
        }

        public Object getItem(int position){
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imgV = new ImageView(mContext);
            return imgV;
        }

    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//
            return;
        }

        mMap = googleMap;
        mMap.setMyLocationEnabled(true);



        mMap.setTrafficEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
//      mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng, 7));
//      mMap.addMarker(new MarkerOptions().position(latlng).title(""));
        mMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {

            @Override
            public void onMapLongClick(LatLng point) {
                mMap.addMarker(new MarkerOptions().position(point).title("").snippet(""));
            }
        });
    }
}
