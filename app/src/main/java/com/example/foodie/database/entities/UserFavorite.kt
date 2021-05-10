package com.example.foodie.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_favorites_table")
data class UserFavorite(
    @PrimaryKey(autoGenerate = true)
    val favoriteId: Long = 0L,

    @ColumnInfo(name = "restaurant_id")
    val restaurantId: Long,

    @ColumnInfo(name = "user_id")
    val userId: Long,

    @ColumnInfo(name = "is_favorite")
    val isFavorite: Boolean
)