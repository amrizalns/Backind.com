package com.example.amrizalns.backind.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.amrizalns.backind.ItemObject;
import com.example.amrizalns.backind.R;
import com.example.amrizalns.backind.RecyclerViewAdapter;
import com.example.amrizalns.backind.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amrizalns on 4/19/17.
 */

public class Fragment_hotel extends Fragment {
    private GridLayoutManager lLayout;
    private RecyclerView.LayoutManager mLayoutManager;

    View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_hotel, null);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(view.getContext(), 2);
        RecyclerView rView = (RecyclerView) view.findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(view.getContext(), rowListItem);
        rView.setAdapter(rcAdapter);

        ViewPager viewPager;

        viewPager = (ViewPager) view.findViewById(R.id.vp_hotel);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getActivity());
        viewPager.setAdapter(viewPagerAdapter);

        return view;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Jalan MH. Thamrin No.102, Bandung","Hotel Ibis"
                ,"Ibis Hotel is 3-star hotel with 4-star hotel facility. Its strategic location makes it easy to mobile both on a business trip or holiday. Your needs to the center of government, public facilities, and entertainment center can be reached within a time because the location is easy to access anywhere, suitable for those who are on a business trip or a holiday."
                ,R.drawable.hotel_1));
        allItems.add(new ItemObject("Jalan Sekartaji N0.03-04, Bandung","Hotel Zest"
                ,"Hotel Zest is 3-star hotel with 4-star hotel facility. Its strategic location makes it easy to mobile both on a business trip or holiday. Your needs to the center of government, public facilities, and entertainment center can be reached within a time because the location is easy to access anywhere, suitable for those who are on a business trip or a holiday. "
                ,R.drawable.hotel_2));
        allItems.add(new ItemObject("Jalan Gatot Subroto No.01, Bandung","Hotel Grand Pullman"
                ,"Hotel Grand Pullman is 3-star hotel with 4-star hotel facility. Its strategic location makes it easy to mobile both on a business trip or holiday. Your needs to the center of government, public facilities, and entertainment center can be reached within a time because the location is easy to access anywhere, suitable for those who are on a business trip or a holiday. "
                , R.drawable.hotel_6));
        allItems.add(new ItemObject("Jalan Veteran No.22-24, Bandung","Hotel Jayakarta"
                ,"Jayakarta Hotel is 3-star hotel with 4-star hotel facility. Its strategic location makes it easy to mobile both on a business trip or holiday. Your needs to the center of government, public facilities, and entertainment center can be reached within a time because the location is easy to access anywhere, suitable for those who are on a business trip or a holiday. "
                , R.drawable.hotel_5));
        allItems.add(new ItemObject("Jalan Pelajar Pejuang No.111, Bandung","Fave Hotel","", R.drawable.hotel_3));
        allItems.add(new ItemObject("Jalan Selat Sunda No.18, Bandung","Hotel Zodiak","", R.drawable.hotel_7));
        allItems.add(new ItemObject("Jalan Soekarno Hatta No.107, Bandung","Hotel Horison","", R.drawable.hotel_4));
        allItems.add(new ItemObject("Jalan Pasir Koja No.79, Bandung","Hotel Grand Cordela","", R.drawable.hotel_8));
        return allItems;
    }
}
