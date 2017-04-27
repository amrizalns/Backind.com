package com.example.amrizalns.backind;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by amrizalns on 4/21/17.
 */

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView loc;
    public TextView name;
    public TextView desc;
    public ImageView img;


    public RelativeLayout relativeLayout;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        relativeLayout = (RelativeLayout) itemView.findViewById(R.id.crd_hotel);

        itemView.setOnClickListener(this);
        loc = (TextView)itemView.findViewById(R.id.hotel_loc);
        name = (TextView) itemView.findViewById(R.id.hotel_name);
        img = (ImageView)itemView.findViewById(R.id.hotel_img);
        desc = (TextView) itemView.findViewById(R.id.hotel_desc);
    }

    @Override
    public void onClick(View v) {

    }
}
