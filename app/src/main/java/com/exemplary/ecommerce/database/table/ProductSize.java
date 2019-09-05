package com.exemplary.ecommerce.database.table;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "product_size")
public class ProductSize {
    @ColumnInfo(name = "size_id")
    @PrimaryKey
    @NonNull
    int sizeId;

    String labelCode;
    String labelName;
    int chest;
    int shoulderWidth;
    int frontWidth;

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public String getLabelCode() {
        return labelCode;
    }

    public void setLabelCode(String labelCode) {
        this.labelCode = labelCode;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public int getShoulderWidth() {
        return shoulderWidth;
    }

    public void setShoulderWidth(int shoulderWidth) {
        this.shoulderWidth = shoulderWidth;
    }

    public int getFrontWidth() {
        return frontWidth;
    }

    public void setFrontWidth(int frontWidth) {
        this.frontWidth = frontWidth;
    }
}
