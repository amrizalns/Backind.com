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
 * Created by amrizalns on 5/2/17.
 */

public class Fragment_wisata extends Fragment {
    private GridLayoutManager lLayout;
    private RecyclerView.LayoutManager mLayoutManager;

    View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_wisata, null);

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
        allItems.add(new ItemObject("Jalan MH. Thamrin No.102, Bandung","The Lodge Maribaya"
                ,"Its strategic location makes it easy to mobile both on a business trip or holiday. Your needs to the center of government, public facilities, and entertainment center can be reached within a time because the location is easy to access anywhere, suitable for those who are on a business trip or a holiday."
                ,R.drawable.wisata_5));
        allItems.add(new ItemObject("Jalan Sekartaji N0.03-04, Bandung","Famhouse Lembang"
                ,"Its strategic location makes it easy to mobile both on a business trip or holiday. Your needs to the center of government, public facilities, and entertainment center can be reached within a time because the location is easy to access anywhere, suitable for those who are on a business trip or a holiday. "
                ,R.drawable.wisata_2));
        allItems.add(new ItemObject("Jalan Gatot Subroto No.01, Bandung","Floating Market"
                ,"Its strategic location makes it easy to mobile both on a business trip or holiday. Your needs to the center of government, public facilities, and entertainment center can be reached within a time because the location is easy to access anywhere, suitable for those who are on a business trip or a holiday. "
                , R.drawable.wisata_4));
        allItems.add(new ItemObject("Jalan Veteran No.22-24, Bandung","Bukit Moko"
                ,"Its strategic location makes it easy to mobile both on a business trip or holiday. Your needs to the center of government, public facilities, and entertainment center can be reached within a time because the location is easy to access anywhere, suitable for those who are on a business trip or a holiday. "
                , R.drawable.img_na));
        allItems.add(new ItemObject("Jalan Pelajar Pejuang No.111, Bandung","Taman Hutan Raya Ir Djuanda","", R.drawable.img_na));
        allItems.add(new ItemObject("Jalan Selat Sunda No.18, Bandung","Tangkuban Perahu","", R.drawable.wisata_1));
        allItems.add(new ItemObject("Jalan Soekarno Hatta No.107, Bandung","Kampung Gajah","", R.drawable.wisata_4));
        allItems.add(new ItemObject("Jalan Pasir Koja No.79, Bandung","De Ranch","", R.drawable.wisata_3));
        return allItems;
    }
}

