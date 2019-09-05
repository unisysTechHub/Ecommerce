package com.exemplary.ecommerce.database.table;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "product",primaryKeys = {"product_id"},foreignKeys =
                            {@ForeignKey(entity = ProductCategory.class,
                                    parentColumns = "category_code",
                                    childColumns = "category_code"),
                            @ForeignKey(entity = ProductSubCategory.class,
                                        parentColumns = "sub_category_code",
                                        childColumns = "sub_category_code"),
                             @ForeignKey(entity = ProductDetails.class,
                                        parentColumns = "product_details_id",
                                     childColumns ="product_details_id" )
                            },
                        indices ={ @Index(value = "product_name"),
                                @Index(value="sub_category_code"),
                                @Index(value = "category_code"),
                                @Index(value = "product_details_id")
                            }

                            )
public class Product {
    @ColumnInfo(name = "product_id")
    @NonNull
    String productId;
    @ColumnInfo(name = "product_name")
    String productName;
    @ColumnInfo(name = "product_details_id")
    String details_id;
    @ColumnInfo(name = "category_code")
    String category_code;
    @ColumnInfo(name="sub_category_code")
    String sub_category_code;

    @ColumnInfo(name="product_price")
    double product_price;



    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory_code() {
        return category_code;
    }

    public void setCategory_code(String category_code) {
        this.category_code = category_code;
    }

    public String getDetails_id() {
        return details_id;
    }

    public void setDetails_id(String details_id) {
        this.details_id = details_id;
    }

    public String getSub_category_code() {
        return sub_category_code;
    }

    public void setSub_category_code(String sub_category_code) {
        this.sub_category_code = sub_category_code;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }
}
