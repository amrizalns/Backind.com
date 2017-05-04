package com.example.amrizalns.backind.fragments;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.amrizalns.backind.R;

public class Fragment_cs extends Fragment {
    View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cs, container, false);
        final Button call = (Button) view.findViewById(R.id.fab_submit_call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder b = new AlertDialog.Builder(getActivity());
                b.setTitle("Confirmation");
                b.setMessage("Are you sure to make a call ?");

                b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(Intent.ACTION_CALL);
                        i.setData(Uri.parse("tel:081223926651")); //nommer bu tien
                        startActivity(i);
                    }
                });
                b.setNegativeButton("No", null);
                AlertDialog alertDialog = b.create();
                alertDialog.show();
            }
        });
        return view;
    }

}
