package com.example.goro.visitvanadzor.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.goro.visitvanadzor.R;


public class MasterClassesFragment extends Fragment {
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
        return inflater.inflate(R.layout.fragment_master_classes, container, false);
    }


}
