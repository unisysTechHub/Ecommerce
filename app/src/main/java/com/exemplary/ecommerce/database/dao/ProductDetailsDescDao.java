package com.exemplary.ecommerce.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;

import com.exemplary.ecommerce.database.table.ProductDesc;
import com.exemplary.ecommerce.database.table.ProductDetails;

@Dao
public interface ProductDetailsDescDao {

    @Insert
    void insertProductDesc(ProductDesc productDesc);

    @Insert
    void insertProductDetail(ProductDetails productDetails);
}
