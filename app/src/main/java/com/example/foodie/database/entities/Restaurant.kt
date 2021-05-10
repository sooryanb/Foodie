package com.example.foodie.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "restaurant_table")
data class Restaurant(
    @PrimaryKey(autoGenerate = true)
    val restaurantId: Long = 0L,

    @ColumnInfo(name = "restaurant_name")
    val restaurantName: String,

    @ColumnInfo(name = "phone_number")
    val phoneNumber: String,

    @ColumnInfo(name = "address")
    val address: String,

    @ColumnInfo(name = "location")
    val location: String,
)