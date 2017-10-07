package com.example.aswinnagarajan.brandworks_app;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aswin Nagarajan on 07-10-2017.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
        Context ctx;
        List<Products> items;
    public CardAdapter(int[] img, Context ct) {
        super();
        ctx = ct;
        items = new ArrayList<Products>();
        for (int i = 0; i < 5; i++) {
            Products product = new Products();
            product.id = i + 1;
            product.name = "Product" + i + 1;
            product.price = (i + 1) * 100;
            product.image = img[i];
            items.add(product);
        }
        Log.d("TOTAL all",items.toString());
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_card_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Products list =  items.get(position);
        Log.d("LIST",list.toString());
        holder.textViewName.setText(list.name);
        holder.textViewUrl.setText(list.price+"");
        Glide.with(ctx).load(list.image).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textViewName;
        public TextView textViewUrl;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewUrl = (TextView) itemView.findViewById(R.id.textViewUrl);

        }
    }
}
