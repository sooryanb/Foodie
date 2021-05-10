package com.example.foodie.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "order_item_table")
data class OrderItem(
    @PrimaryKey(autoGenerate = true)
    val order_item_id: Long = 0L,

    @ColumnInfo(name = "order_id")
    val orderId: Long,

    @ColumnInfo(name = "item_id")
    val itemId: Long,

    @ColumnInfo(name = "quantity")
    val quantity: Int
)