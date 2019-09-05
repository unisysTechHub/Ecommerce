package com.exemplary.ecommerce.database.table;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "product_sub_category",primaryKeys = {"sub_category_code"},indices = @Index(value = "sub_category_name",unique = true))
public class ProductSubCategory  {

    @ColumnInfo(name = "sub_category_code")
    @NonNull
     String subCategoryCode;

    @ColumnInfo(name = "sub_category_name")
    String subCategoryName;

    @NonNull
    public String getSubCategoryCode() {
        return subCategoryCode;
    }

    public void setSubCategoryCode(@NonNull String subCategoryCode) {
        this.subCategoryCode = subCategoryCode;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }
}
