package com.example.foodie.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.foodie.database.entities.Order
import com.example.foodie.database.entities.User
import com.example.foodie.database.entities.UserFavorite

@Dao
interface UserDao {

    @Insert
    fun insertUser(user: User)

    @Update
    fun updateUser(user: User)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUserFavorite(userFavorite: UserFavorite)

    @Query("select * from user_table where phone_number = :phoneNumber")
    fun getUser(phoneNumber : String): User?

    @Query("select * from user_favorites_table where user_id = :user_id")
    fun getUserFavoriteRestaurants(user_id: Long): LiveData<List<UserFavorite>>

    @Query("select * from order_table where user_id = :user_id")
    fun getUserOrders(user_id: Long): LiveData<List<Order>>


}