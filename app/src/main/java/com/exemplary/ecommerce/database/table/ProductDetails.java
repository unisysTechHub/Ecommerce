package com.exemplary.ecommerce.database.table;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "product_details",
        foreignKeys ={ @ForeignKey(
                            entity = ProductDesc.class,
                            parentColumns ={"product_desc_id"},
                            childColumns =  "product_desc_id"),

                    },indices = {@Index(value = "product_desc_id")}
                    )
public class ProductDetails {

    @ColumnInfo(name = "product_details_id")
    @PrimaryKey
    @NonNull
    String productDetailsId;

    @ColumnInfo(name="product_name")
    String productName;

    @ColumnInfo(name =  "product_desc_id")
    String productDescId;

    @ColumnInfo(name = "product_brand_name")
    String bandName;

    @ColumnInfo(name="product_avail_sizes")
    String sizeList;

    @ColumnInfo(name="product_avail_colors")
    String colorList;

    @NonNull
    public String getProductDetailsId() {
        return productDetailsId;
    }

    public void setProductDetailsId(@NonNull String productDetailsId) {
        this.productDetailsId = productDetailsId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescId() {
        return productDescId;
    }

    public void setProductDescId(String productDescId) {
        this.productDescId = productDescId;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getSizeList() {
        return sizeList;
    }

    public void setSizeList(String sizeList) {
        this.sizeList = sizeList;
    }

    public String getColorList() {
        return colorList;
    }

    public void setColorList(String colorList) {
        this.colorList = colorList;
    }
}
