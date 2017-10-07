package com.example.aswinnagarajan.brandworks_app;

/**
 * Created by Aswin Nagarajan on 07-10-2017.
 */
public class MyCart {
    int[] products;
    int k=0;

    void addProduct(int id){
        products[k]=id;
        k++;
    }

}
