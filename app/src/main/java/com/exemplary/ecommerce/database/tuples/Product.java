package com.exemplary.ecommerce.database.tuples;

import androidx.room.ColumnInfo;

public class Product {
    @ColumnInfo(name = "product_id")
    String poductId;
    @ColumnInfo(name = "product_name")
    String name;
    @ColumnInfo(name="product_price")
    double price;

    @ColumnInfo(name = "category_code")
    String category;

    @ColumnInfo(name = "sub_category_code")
    String subCategory;

    @ColumnInfo(name = "product_brand_name")
    String brandName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPoductId() {
        return poductId;
    }

    public void setPoductId(String poductId) {
        this.poductId = poductId;
    }
}
