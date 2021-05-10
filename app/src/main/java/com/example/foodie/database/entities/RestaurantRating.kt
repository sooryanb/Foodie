package com.example.foodie.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "restaurant_rating_table")
data class RestaurantRating(
    @PrimaryKey(autoGenerate = true)
    val ratingId: Long = 0L,

    @ColumnInfo(name = "restaurant_id")
    val restaurantId: Long,

    @ColumnInfo(name = "user_id")
    val userId: Long,

    @ColumnInfo(name = "rating")
    val rating: Int

)