package com.exemplary.ecommerce.database.table;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "product_category",primaryKeys = { "category_code"}, indices = @Index(value = "category_name",unique = true))
public class ProductCategory {

    @ColumnInfo(name="category_code")
    @NonNull
    String categoryCode;

    @ColumnInfo(name = "category_name")
    String categpryName;

    @NonNull
    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(@NonNull String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategpryName() {
        return categpryName;
    }

    public void setCategpryName(String categpryName) {
        this.categpryName = categpryName;
    }
}
