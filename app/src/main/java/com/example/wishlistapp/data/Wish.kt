package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish-table")
data class Wish(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Apple iphone 13 pro", description = "no Dynamic island"),
        Wish(title = "Apple iphone 14 pro", description = "Dynamic island introduced"),
        Wish(title = "Apple iphone 15 pro", description = "Improved Dynamic island")
    )
}
