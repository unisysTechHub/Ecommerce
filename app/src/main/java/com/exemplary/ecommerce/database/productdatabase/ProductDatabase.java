package com.exemplary.ecommerce.database.productdatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.exemplary.ecommerce.database.dao.ProductCategoryDao;
import com.exemplary.ecommerce.database.dao.ProductDetailsDescDao;
import com.exemplary.ecommerce.database.dao.ProductTableDao;
import com.exemplary.ecommerce.database.table.Colors;
import com.exemplary.ecommerce.database.table.Product;
import com.exemplary.ecommerce.database.table.ProductCategory;
import com.exemplary.ecommerce.database.table.ProductDesc;
import com.exemplary.ecommerce.database.table.ProductDetails;
import com.exemplary.ecommerce.database.table.ProductSize;
import com.exemplary.ecommerce.database.table.ProductSubCategory;

@Database(entities = {Product.class, ProductDetails.class, ProductDesc.class,
        ProductCategory.class, ProductSubCategory.class, ProductSize.class, Colors.class
                      },version = 2,exportSchema = false)
public  abstract  class ProductDatabase extends RoomDatabase {
    public static ProductDatabase productDatabase;
    public abstract ProductCategoryDao productCategoryDao();
    public abstract ProductTableDao productTableDao();
    public abstract ProductDetailsDescDao productDescDao();


    public static ProductDatabase getInstance(Context context)
    {
        if(productDatabase == null)
        productDatabase=Room.databaseBuilder(context,ProductDatabase.class,"product_database").build();

        return productDatabase;

    }



}
