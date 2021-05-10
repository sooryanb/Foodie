package com.example.foodie.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey


@Entity(tableName = "user_table", indices = [Index(value = ["phone_number"], unique = true)])
data class User(
    @PrimaryKey(autoGenerate = true)
    val userId: Long = 0L,

    @ColumnInfo(name="first_name")
    val fullName: String,

    @ColumnInfo(name="phone_number")
    val phoneNumber: String,

    @ColumnInfo(name="email_address")
    val emailAddress: String,

    @ColumnInfo(name="location")
    val location: String
)