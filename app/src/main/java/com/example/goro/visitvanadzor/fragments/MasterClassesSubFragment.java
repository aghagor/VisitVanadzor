package com.example.goro.visitvanadzor.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.goro.visitvanadzor.R;
import com.example.goro.visitvanadzor.classes.Manifacture;


public class MasterClassesSubFragment extends Fragment {
    private static Context mContext;
    private Manifacture mManifacture;
    private ImageView coverImg;
    private TextView coverStr;
    private ImageView fbImg;
    private ImageView twiterImg;
    private ImageView gmailImg;
    private RatingBar ratingBar;
    private Button button;




    public static MasterClassesSubFragment newInstance(Context context, Manifacture manifacture) {
        mContext = context;
        MasterClassesSubFragment fragment = new MasterClassesSubFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        fragment.mManifacture = manifacture;
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_master_classes_sub, container, false);
        coverImg = view.findViewById(R.id.class_item_img);
        coverStr = view.findViewById(R.id.class_item_tv);
        fbImg = view.findViewById(R.id.facebook_img);
        twiterImg = view.findViewById(R.id.twitter_img);
        gmailImg = view.findViewById(R.id.gmail_img);
        ratingBar = view.findViewById(R.id.rat_bar);
        button = view.findViewById(R.id.button_class_sub);




        return view;
    }




}
