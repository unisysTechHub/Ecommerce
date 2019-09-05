package com.exemplary.ecommerce.database.table;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "colors")
public class Colors {

    @ColumnInfo(name = "color_id")
    @PrimaryKey
    int Id;
    @ColumnInfo(name = "color")
    String color;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
