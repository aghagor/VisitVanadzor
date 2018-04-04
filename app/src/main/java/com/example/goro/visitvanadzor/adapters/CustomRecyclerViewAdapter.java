package com.example.goro.visitvanadzor.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.goro.visitvanadzor.activities.MainActivity;
import com.example.goro.visitvanadzor.interfaces.CustomItemClickListener;
import com.example.goro.visitvanadzor.classes.Manifacture;
import com.example.goro.visitvanadzor.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import shivam.developer.featuredrecyclerview.FeatureRecyclerViewAdapter;

public class CustomRecyclerViewAdapter extends FeatureRecyclerViewAdapter<CustomRecyclerViewAdapter.CustomRecyclerViewHolder> {

    CustomItemClickListener listener;
    private List<Manifacture> dataList;
    private Context context;
//    private int[] images = new int[7];

    public CustomRecyclerViewAdapter(Context context, List<Manifacture> list, CustomItemClickListener listener) {
        this.dataList = list;
        this.context = context;
        this.listener = listener;
    }




    @Override
    public CustomRecyclerViewHolder onCreateFeaturedViewHolder(ViewGroup parent, int viewType) {
        return new CustomRecyclerViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindFeaturedViewHolder(CustomRecyclerViewHolder holder, final int position) {
        Picasso.with(context)
                .load(dataList.get(position).getImg()).into(holder.ivBackground);
        holder.tvHeading.setText(dataList.get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(dataList.get(position));
            }
        });
    }

    @Override
    public int getFeaturedItemsCount() {
        return dataList.size();
    }

    @Override
    public void onSmallItemResize(CustomRecyclerViewHolder holder, int position, float offset) {
        holder.tvHeading.setAlpha(offset / 0f);
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

            ivBackground = (ImageView) itemView.findViewById(R.id.iv_background);
            tvHeading = (TextView) itemView.findViewById(R.id.tv_heading);
        }
    }
}
