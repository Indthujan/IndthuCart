package com.indthudev.indthucart.ui.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.indthudev.indthucart.R
import com.indthudev.indthucart.data.db.ShoppingDatabase
import com.indthudev.indthucart.data.repositories.ShoppingRepository

class ShoppingCartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_cart)

        val database = ShoppingDatabase(this)
        val repository = ShoppingRepository(database)
        val factory = ShoppingViewModelFactory(repository)

        val ViewModel = ViewModelProviders.of(this).get(ShoppingViewModel::class.java)
    }
}