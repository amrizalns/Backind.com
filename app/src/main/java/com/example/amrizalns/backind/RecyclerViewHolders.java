package com.example.amrizalns.backind;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by amrizalns on 4/21/17.
 */

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView loc;
    public TextView desc;
    public ImageView img;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        loc = (TextView)itemView.findViewById(R.id.hotel_loc);
        desc = (TextView) itemView.findViewById(R.id.hotel_name);
        img = (ImageView)itemView.findViewById(R.id.hotel_img);
    }

    @Override
    public void onClick(View v) {

    }
}
