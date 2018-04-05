package com.example.goro.visitvanadzor.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.goro.visitvanadzor.classes.Manifacture;
import com.example.goro.visitvanadzor.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Goro on 03.04.2018.
 */

public class MainFragment extends Fragment {
    private static Context mContext;
    private Manifacture mManifacture;
    private TextView titleTextView;
    private Button backButton;
    private ImageView detailImageView;
    private TextView description;
    private TextView langitude;
    private TextView longitude;


    public static MainFragment newInstance(Context context, Manifacture manifacture) {
        mContext = context;

        MainFragment mainFragment = new MainFragment();
        Bundle bundle = new Bundle();
        mainFragment.setArguments(bundle);
        mainFragment.mManifacture = manifacture;
        return mainFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ditail_fragment_view, container, false);
        titleTextView = view.findViewById(R.id.title_text_view);
        backButton = view.findViewById(R.id.back_button);
        detailImageView = view.findViewById(R.id.image_view_manifacture);
        description = view.findViewById(R.id.detaile_description_text_view);
        langitude = view.findViewById(R.id.langitude_text_view);
        longitude = view.findViewById(R.id.longitude_text_view);

        Picasso.with(getActivity())
                .load(mManifacture.getImg()).into(detailImageView);
        description.setText(mManifacture.getDescription());
        langitude.setText(String.valueOf(mManifacture.getLangitude()));
        longitude.setText(String.valueOf(mManifacture.getLongitude()));

        titleTextView.setText(mManifacture.getTitle());

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return view;
    }
}
