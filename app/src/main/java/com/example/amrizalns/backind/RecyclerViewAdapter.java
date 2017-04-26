package com.example.amrizalns.backind;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by amrizalns on 4/21/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders>{
    private List<ItemObject> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_hotel, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.loc.setText(itemList.get(position).getLocation());
        holder.desc.setText(itemList.get(position).getName());
        holder.img.setImageResource(itemList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
