package com.example.amrizalns.backind;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail_hotel extends AppCompatActivity {
    ImageView img;
    TextView name,loc, desc;

    String img_detail;
    String name_detail;
    String loc_detail;
    String desc_detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hotel);

        img = (ImageView) findViewById(R.id.detail_img);
        name = (TextView) findViewById(R.id.detail_name);
        loc = (TextView) findViewById(R.id.detail_loc);
        desc = (TextView) findViewById(R.id.detail_desc);

        Intent i = getIntent();
        img_detail = i.getStringExtra("img");
//        img.setImageResource(Integer.parseInt(img_detail));

        name_detail = i.getStringExtra("name");
        name.setText(name_detail);

        loc_detail = i.getStringExtra("loc");
        loc.setText(loc_detail);

        desc_detail = i.getStringExtra("desc");
        desc.setText(desc_detail);
    }
}
