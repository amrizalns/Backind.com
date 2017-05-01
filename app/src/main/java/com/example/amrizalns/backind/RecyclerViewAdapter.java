package com.example.amrizalns.backind;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amrizalns.backind.activity.detail_hotel;
import com.example.amrizalns.backind.activity.detail_kuliner;

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
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_content, null);

        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, final int position) {
        holder.loc.setText(itemList.get(position).getLocation());
        holder.name.setText(itemList.get(position).getName());
        holder.img.setImageResource(itemList.get(position).getImg());
        holder.desc.setText(itemList.get(position).getDesc());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, detail_hotel.class);
                i.putExtra("img", itemList.get(position).getImg());
                i.putExtra("loc", itemList.get(position).getLocation());
                i.putExtra("name", itemList.get(position).getName());
                i.putExtra("desc", itemList.get(position).getDesc());

                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
