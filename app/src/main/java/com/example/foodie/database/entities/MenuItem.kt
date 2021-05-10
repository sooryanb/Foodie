package com.example.foodie.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "menu_item_table")
data class MenuItem(
    @PrimaryKey(autoGenerate = true)
    val itemId: Long = 0L,

    @ColumnInfo(name = "restaurant_id")
    val restaurantId: Long,

    @ColumnInfo(name = "item_name")
    val itemName: String,

    @ColumnInfo(name = "item_price")
    val itemPrice: Int
)