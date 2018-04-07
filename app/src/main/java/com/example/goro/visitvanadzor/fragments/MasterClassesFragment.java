package com.example.goro.visitvanadzor.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.goro.visitvanadzor.R;
import com.squareup.picasso.Picasso;


public class MasterClassesFragment extends Fragment {

    private ImageView paytagortsImg;
    private ImageView tarazImg;
    private ImageView qadakImg;
    private ImageView kavImg;
    private ImageView karpetImg;
    private ImageView nkarichImg;
    private ImageView khorovatsImg;
    private ImageView tonirImg;
    private ImageView hamateghImg;
    private ImageView gataImg;
    private ImageView arishtaImg;
    private ImageView avandakanImg;
    private ImageView khotabuyserImg;
    private ImageView dzknorsutyunImg;
    private ImageView meghvapahutyunImg;
    private ImageView qaylarshavImg;
    private ImageView azgayinYergImg;
    private ImageView azgayinParImg;
    private ImageView dudukImg;
    private ImageView rockImg;
    private ImageView panirImg;
    private ImageView lanchImg;

    private static Context mContext;

    public static MasterClassesFragment newInstance(Context context) {
        MasterClassesFragment fragment = new MasterClassesFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_master_classes, container, false);

        paytagortsImg = view.findViewById(R.id.iv_paytagorts);
        tarazImg = view.findViewById(R.id.iv_tiknikagorts);
        qadakImg = view.findViewById(R.id.iv_qandakagorts);
        kavImg = view.findViewById(R.id.iv_kavagorts);
        karpetImg = view.findViewById(R.id.iv_karpet);
        nkarichImg = view.findViewById(R.id.iv_nkarich);
        khorovatsImg = view.findViewById(R.id.iv_khorovats);
        tonirImg = view.findViewById(R.id.iv_lavash);
        hamateghImg = view.findViewById(R.id.iv_tolma);
        gataImg = view.findViewById(R.id.iv_muraba);
        arishtaImg = view.findViewById(R.id.iv_gata);
        avandakanImg = view.findViewById(R.id.iv_avandakan);
        khotabuyserImg = view.findViewById(R.id.iv_khotabuyser);
        dzknorsutyunImg = view.findViewById(R.id.iv_dzknorsutyun);
        meghvapahutyunImg = view.findViewById(R.id.iv_kolorit);
        qaylarshavImg = view.findViewById(R.id.iv_qaylarshav);
        azgayinYergImg = view.findViewById(R.id.iv_azgayin_erg);
        azgayinParImg = view.findViewById(R.id.iv_azgayin_par);
        dudukImg = view.findViewById(R.id.iv_duduk_kitar);
        rockImg = view.findViewById(R.id.iv_rock);
        panirImg = view.findViewById(R.id.iv_panir);
        lanchImg = view.findViewById(R.id.iv_lanch);

        

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return view;
    }


}
