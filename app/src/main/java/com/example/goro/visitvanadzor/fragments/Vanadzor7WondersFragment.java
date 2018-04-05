package com.example.goro.visitvanadzor.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.goro.visitvanadzor.R;
import com.example.goro.visitvanadzor.classes.Manifacture;
import com.squareup.picasso.Picasso;


public class Vanadzor7WondersFragment extends Fragment {

    private static Context mContext;
    private Manifacture mManifacture;

    private ImageView coverImg;
    private ImageView coverImg2;
    private ImageView ekegheciImg;
    private ImageView geghagitakanImg;
    private ImageView dprocImg;
    private ImageView palanduzancImg;
    private ImageView osepancImg;
    private ImageView tayirovnerImg;
    private ImageView ruskanImg;

    private TextView coverText;
    private TextView coverText2;
    private TextView ekegheciTxt;
    private TextView geghagitakanTxt;
    private TextView dprocTxt;
    private TextView palanduzancTxt;
    private TextView osepancTxt;
    private TextView tayirovnerTxt;
    private TextView rusakanTxt;


    public static Vanadzor7WondersFragment newInstance(Context context, Manifacture manifacture) {
        mContext = context;
        Vanadzor7WondersFragment fragment = new Vanadzor7WondersFragment();
        Bundle args = new Bundle();
        fragment.mManifacture = manifacture;
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_vanadzor7_hrashq, container, false);
        coverImg = view.findViewById(R.id.cover_img);
        coverImg2 = view.findViewById(R.id.samvel_img);
        ekegheciImg = view.findViewById(R.id.ekegheci_img);
        geghagitakanImg = view.findViewById(R.id.geghagitakan_img);
        dprocImg = view.findViewById(R.id.dproc_img);
        palanduzancImg = view.findViewById(R.id.palanduzanc_img);
        osepancImg = view.findViewById(R.id.osepi_img);
        tayirovnerImg = view.findViewById(R.id.tayirov_img);
        ruskanImg = view.findViewById(R.id.rusakan_img);

        coverText = view.findViewById(R.id.cover_text_view);
        coverText2 = view.findViewById(R.id.cover_text_view2);
        ekegheciTxt = view.findViewById(R.id.ekegheci_text_view);
        geghagitakanTxt = view.findViewById(R.id.geghagitakan_text_view);
        dprocTxt = view.findViewById(R.id.dproc_text_view);
        palanduzancTxt = view.findViewById(R.id.palanduzanc_text_view);
        osepancTxt = view.findViewById(R.id.osepi_text_view);
        tayirovnerTxt = view.findViewById(R.id.tayirov_text_view);
        rusakanTxt = view.findViewById(R.id.rusakan_text_view);



        Picasso.with(getActivity()).load(mManifacture.getImageCover()).into(coverImg);
        Picasso.with(getActivity()).load(mManifacture.getImageSamvelKhalatyan()).into(coverImg2);
        Picasso.with(getActivity()).load(mManifacture.getImageOne()).into(ekegheciImg);
        Picasso.with(getActivity()).load(mManifacture.getImageTwo()).into(geghagitakanImg);
        Picasso.with(getActivity()).load(mManifacture.getImageThree()).into(dprocImg);
        Picasso.with(getActivity()).load(mManifacture.getImageFour()).into(palanduzancImg);
        Picasso.with(getActivity()).load(mManifacture.getImageFive()).into(osepancImg);
        Picasso.with(getActivity()).load(mManifacture.getImageSix()).into(tayirovnerImg);
        Picasso.with(getActivity()).load(mManifacture.getImageSeven()).into(ruskanImg);

        coverText.setText(mManifacture.getCoverText());
        coverText2.setText(mManifacture.getCoverText2());
        ekegheciTxt.setText(mManifacture.getOne());
        geghagitakanTxt.setText(mManifacture.getTwo());
        dprocTxt.setText(mManifacture.getThree());
        palanduzancTxt.setText(mManifacture.getFour());
        osepancTxt.setText(mManifacture.getFive());
        tayirovnerTxt.setText(mManifacture.getSix());
        rusakanTxt.setText(mManifacture.getSeven());


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        // Inflate the layout for this fragment
        return view;
    }


}
