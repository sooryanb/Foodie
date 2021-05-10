package com.example.foodie.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.foodie.database.dao.OrderDao
import com.example.foodie.database.dao.RestaurantDao
import com.example.foodie.database.dao.UserDao
import com.example.foodie.database.entities.*

@Database(
        entities = [MenuItem::class, Order::class, OrderItem::class, Restaurant::class, RestaurantRating::class, User::class, UserFavorite::class],
        version = 1,
        exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    abstract val orderDao: OrderDao
    abstract val restaurantDao: RestaurantDao
    abstract val userDao: UserDao

    companion object{

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                            context.applicationContext,
                            AppDatabase::class.java,
                            "foodie_database"
                    )
                            .fallbackToDestructiveMigration()
                            .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }

}

