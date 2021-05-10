package com.example.foodie.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.foodie.database.entities.MenuItem
import com.example.foodie.database.entities.Restaurant

@Dao
interface RestaurantDao{

    @Insert
    fun insertRestaurant(restaurant: Restaurant)

    @Query("select * from restaurant_table where restaurantId = :key")
    fun getRestaurant(key: Long): Restaurant?

    @Query("select * from restaurant_table")
    fun getAllRestaurants(): LiveData<List<Restaurant>>

    @Query("select * from menu_item_table where restaurant_id = :restaurant_id")
    fun getMenu(restaurant_id: Long): LiveData<List<MenuItem>>

}