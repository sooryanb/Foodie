package com.example.foodie.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.foodie.database.entities.Order
import com.example.foodie.database.entities.OrderItem

@Dao
interface OrderDao {

    @Insert
    fun createOrder(order: Order)

    @Update
    fun updateOrder(order: Order)

    @Query("select * from order_table where orderId = :order_id")
    fun getOrder(order_id: Long) : Order?

    @Query("select * from order_table where user_id = :user_id")
    fun getUserOrders(user_id: Long): LiveData<List<Order>>

    @Insert
    fun createOrderItem(orderItem: OrderItem)

    @Update
    fun updateOrderItem(orderItem: OrderItem)

    @Query("select * from order_item_table where order_id = :order_id")
    fun getAllOrderItems(order_id: Long): LiveData<List<OrderItem>>

}