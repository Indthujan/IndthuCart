package com.indthudev.indthucart.data.repositories

import com.indthudev.indthucart.data.db.ShoppingDatabase
import com.indthudev.indthucart.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDAO().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDAO().delete(item)

    fun getAllShoppingItems() = db.getShoppingDAO().getAllShoppingItems()
}