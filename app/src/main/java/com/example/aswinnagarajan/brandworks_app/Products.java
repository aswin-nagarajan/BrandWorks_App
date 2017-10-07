package com.example.aswinnagarajan.brandworks_app;

import android.graphics.Bitmap;
import android.media.Image;
import android.widget.ImageView;

/**
 * Created by Aswin Nagarajan on 07-10-2017.
 */
public class Products {
    String name;
    int id;
    int price;
    int image;
    public String toString(){
        return (name+id+price);
    }
}
