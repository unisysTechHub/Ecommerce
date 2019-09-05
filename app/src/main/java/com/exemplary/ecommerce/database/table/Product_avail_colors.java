package com.exemplary.ecommerce.database.table;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {
                    @ForeignKey(entity = Colors.class,
                                parentColumns = "color_id",
                                childColumns = {"color_id(1)","color_id(2)","color_id(3)","color_id(4)","color_id(5)"
                                  }),
                    @ForeignKey(entity = ProductDetails.class,
                                parentColumns = "product_desc_id",
                                childColumns = "product_desc_id"
                    )

                        })
public class Product_avail_colors {
    @ColumnInfo(name = "product_avail_color_id")
    @PrimaryKey
    @NonNull
    String prdouctId;

    @ColumnInfo(name = "color_id(1)")
    String  colorId1;

    @ColumnInfo(name = "color_id(2)")
    String  colorId2;

    @ColumnInfo(name = "color_id(3)")
    String  colorId3;

    @ColumnInfo(name = "color_id(4)")
    String  colorId4;

    @ColumnInfo(name = "color_id(5)")
    String  colorId5;
    @ColumnInfo(name = "color_id(6)")
    String  colorId6;
}
