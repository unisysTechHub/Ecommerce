package com.exemplary.ecommerce.database.table;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "product_desc")
public class ProductDesc {

    @ColumnInfo(name = "product_desc_id")
    @PrimaryKey
    @NonNull
    String productDescId;

    @ColumnInfo(name="product_des(1)")
    String productDes1;

    @ColumnInfo(name="product_des(2)")
    String productDes2;

    @ColumnInfo(name="product_des(3)")
    String productDes3;

    @ColumnInfo(name="product_des(4)")
    String productDes4;

    @ColumnInfo(name="product_des(5)")
    String productDes5;

    @ColumnInfo(name="product_des(6)")
    String productDes6;

    public String getProductDescId() {
        return productDescId;
    }

    public void setProductDescId(String productDescId) {
        this.productDescId = productDescId;
    }

    public String getProductDes1() {
        return productDes1;
    }

    public void setProductDes1(String productDes1) {
        this.productDes1 = productDes1;
    }

    public String getProductDes2() {
        return productDes2;
    }

    public void setProductDes2(String productDes2) {
        this.productDes2 = productDes2;
    }

    public String getProductDes3() {
        return productDes3;
    }

    public void setProductDes3(String productDes3) {
        this.productDes3 = productDes3;
    }

    public String getProductDes4() {
        return productDes4;
    }

    public void setProductDes4(String productDes4) {
        this.productDes4 = productDes4;
    }

    public String getProductDes5() {
        return productDes5;
    }

    public void setProductDes5(String productDes5) {
        this.productDes5 = productDes5;
    }

    public String getProductDes6() {
        return productDes6;
    }

    public void setProductDes6(String productDes6) {
        this.productDes6 = productDes6;
    }
}
