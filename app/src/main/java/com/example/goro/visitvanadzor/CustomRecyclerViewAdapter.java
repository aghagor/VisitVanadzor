package com.example.goro.visitvanadzor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import shivam.developer.featuredrecyclerview.FeatureRecyclerViewAdapter;

public class CustomRecyclerViewAdapter extends FeatureRecyclerViewAdapter<CustomRecyclerViewAdapter.CustomRecyclerViewHolder> {

    private List<String> dataList;
    private Context context;
    private int[] images = new int[5];

    public CustomRecyclerViewAdapter(Context context, List<String> list) {
        this.dataList = list;
        this.context = context;

        images[0] = R.drawable.amenorya;
        images[1] = R.drawable.andzrevayin;
        images[2] = R.drawable.arcakh;
        images[3] = R.drawable.dzmerayin;
        images[4] = R.drawable.ljer_navak;

    }

    @Override
    public CustomRecyclerViewHolder onCreateFeaturedViewHolder(ViewGroup parent, int viewType) {
        return new CustomRecyclerViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindFeaturedViewHolder(CustomRecyclerViewHolder holder, int position) {
        Picasso.with(context)
                .load(images[position % 4]).into(holder.ivBackground);
        holder.tvHeading.setText(dataList.get(position));
    }

    @Override
    public int getFeaturedItemsCount() {
        return dataList.size();
    }

    @Override
    public void onSmallItemResize(CustomRecyclerViewHolder holder, int position, float offset) {
        holder.tvHeading.setAlpha(offset / 100f);
    }

    @Override
    public void onBigItemResize(CustomRecyclerViewHolder holder, int position, float offset) {
        holder.tvHeading.setAlpha(offset / 100f);
    }

    public static class CustomRecyclerViewHolder extends RecyclerView.ViewHolder {

        ImageView ivBackground;
        TextView tvHeading;

        public CustomRecyclerViewHolder(View itemView) {
            super(itemView);

            ivBackground = (ImageView) itemView.findViewById(R.id.person_photo);
            tvHeading = (TextView) itemView.findViewById(R.id.person_name);
        }
    }
}
