package com.exemplary.ecommerce.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import com.exemplary.ecommerce.database.table.ProductDetails;
import com.exemplary.ecommerce.database.tuples.Product;

import java.util.List;

@Dao
public interface ProductTableDao {

    @Insert
    void insert(com.exemplary.ecommerce.database.table.Product product);

    @Query(" SELECT p.product_id, p.product_name,p.product_price, pc.category_code  " +
            ",psc.sub_category_code" +
            " FROM product p " +
          "INNER JOIN product_category pc ON p.category_code = pc.category_code " +
            "INNER JOIN product_sub_category psc ON p.sub_category_code= psc.sub_category_code " +
//            "INNER JOIN product_details pd ON p.product_details_id = pd.product_details_id "
           " where p.product_id like :productId || '%' and psc.sub_category_code like 'E%' "
    )
    public LiveData<List<Product>> getAllProductDetails(String productId);


    @Insert
    void insertProduct(com.exemplary.ecommerce.database.table.Product product);


    @Update
    void updateProduct(com.exemplary.ecommerce.database.table.Product... products);








}
