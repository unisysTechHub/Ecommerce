package com.exemplary.ecommerce.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.exemplary.ecommerce.database.table.ProductCategory;
import com.exemplary.ecommerce.database.table.ProductSubCategory;

import java.util.List;

@Dao
public interface ProductCategoryDao {

    @Query( "SELECT * from product_category")
     List<ProductCategory> getCategories();

    @Query("SELECT * from product_sub_category")
    public LiveData<ProductSubCategory> getSubCatgoreis();

    @Insert
    void insterCategoreis(ProductCategory productCategory);

    @Insert
    void insertSubCategories(ProductSubCategory productSubCategory);


    @Update
    void updateCategories(ProductCategory... productCategories);

    @Update
    void updateSubCategoresi(ProductSubCategory... productSubCategories);




}
