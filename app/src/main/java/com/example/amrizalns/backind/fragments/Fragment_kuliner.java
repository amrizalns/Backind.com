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
 * Created by amrizalns on 4/29/17.
 */

public class Fragment_kuliner extends Fragment {
    private GridLayoutManager lLayout;
    private RecyclerView.LayoutManager mLayoutManager;

    View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_kuliner, null);

        List<ItemObject> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(view.getContext(), 2);
        RecyclerView rView = (RecyclerView) view.findViewById(R.id.recycler_view_kuliner);
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
        allItems.add(new ItemObject("Jalan Burangrang No.102, Bandung","Bakso Boedjangan"
                ,"Makanan adalah bahan, biasanya berasal dari hewan atau tumbuhan, yang dimakan oleh makhluk hidup mendapatkan tenaga dan nutrisi. Cairan yang dipakai untuk maksud ini sering disebut minuman, tetapi kata 'makanan' juga bisa dipakai. Istilah ini kadang-kadang dipakai dengan kiasan, seperti \"makanan untuk pemikiran\". Kecukupan makanan dapat dinilai dengan status gizi secara antropometri."
                ,R.drawable.kuliner_a));
        allItems.add(new ItemObject("Jalan Buah Batu N0.40, Bandung","Sate Taichan"
                ,"Makanan adalah bahan, biasanya berasal dari hewan atau tumbuhan, yang dimakan oleh makhluk hidup mendapatkan tenaga dan nutrisi. Cairan yang dipakai untuk maksud ini sering disebut minuman, tetapi kata 'makanan' juga bisa dipakai. Istilah ini kadang-kadang dipakai dengan kiasan, seperti \"makanan untuk pemikiran\". Kecukupan makanan dapat dinilai dengan status gizi secara antropometri."
                ,R.drawable.kuliner_b));
        allItems.add(new ItemObject("Jalan Pelajar Pejuang No.31, Bandung","ABUBA Steak"
                ,"Makanan adalah bahan, biasanya berasal dari hewan atau tumbuhan, yang dimakan oleh makhluk hidup mendapatkan tenaga dan nutrisi. Cairan yang dipakai untuk maksud ini sering disebut minuman, tetapi kata 'makanan' juga bisa dipakai. Istilah ini kadang-kadang dipakai dengan kiasan, seperti \"makanan untuk pemikiran\". Kecukupan makanan dapat dinilai dengan status gizi secara antropometri."
                , R.drawable.kuliner_c));
        allItems.add(new ItemObject("Jalan Veteran No.22-24, Bandung","Sate Taichan"
                ,"Makanan adalah bahan, biasanya berasal dari hewan atau tumbuhan, yang dimakan oleh makhluk hidup mendapatkan tenaga dan nutrisi. Cairan yang dipakai untuk maksud ini sering disebut minuman, tetapi kata 'makanan' juga bisa dipakai. Istilah ini kadang-kadang dipakai dengan kiasan, seperti \"makanan untuk pemikiran\". Kecukupan makanan dapat dinilai dengan status gizi secara antropometri."
                , R.drawable.img_na));
        allItems.add(new ItemObject("Jalan Burangrang No.40, Bandung","Upnormal Cafe"
                ,"Makanan adalah bahan, biasanya berasal dari hewan atau tumbuhan, yang dimakan oleh makhluk hidup mendapatkan tenaga dan nutrisi. Cairan yang dipakai untuk maksud ini sering disebut minuman, tetapi kata 'makanan' juga bisa dipakai. Istilah ini kadang-kadang dipakai dengan kiasan, seperti \"makanan untuk pemikiran\". Kecukupan makanan dapat dinilai dengan status gizi secara antropometri."
                , R.drawable.img_na));
        allItems.add(new ItemObject("Jalan Burangrang No.31, Bandung","Bakso Enggal"
                ,"Makanan adalah bahan, biasanya berasal dari hewan atau tumbuhan, yang dimakan oleh makhluk hidup mendapatkan tenaga dan nutrisi. Cairan yang dipakai untuk maksud ini sering disebut minuman, tetapi kata 'makanan' juga bisa dipakai. Istilah ini kadang-kadang dipakai dengan kiasan, seperti \"makanan untuk pemikiran\". Kecukupan makanan dapat dinilai dengan status gizi secara antropometri."
                , R.drawable.img_na));
        allItems.add(new ItemObject("Jalan Banteng N0.101, Bandung","Waroeng Steak and Shake"
                ,"Makanan adalah bahan, biasanya berasal dari hewan atau tumbuhan, yang dimakan oleh makhluk hidup mendapatkan tenaga dan nutrisi. Cairan yang dipakai untuk maksud ini sering disebut minuman, tetapi kata 'makanan' juga bisa dipakai. Istilah ini kadang-kadang dipakai dengan kiasan, seperti \"makanan untuk pemikiran\". Kecukupan makanan dapat dinilai dengan status gizi secara antropometri."
                , R.drawable.img_na));
        return allItems;
    }
}
