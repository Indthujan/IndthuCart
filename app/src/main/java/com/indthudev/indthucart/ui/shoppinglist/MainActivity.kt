package com.indthudev.indthucart.ui.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.indthudev.indthucart.R
import com.indthudev.indthucart.data.db.ShoppingDatabase
import com.indthudev.indthucart.data.repositories.ShoppingRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = ShoppingDatabase(this)
        val repository = ShoppingRepository(database)
        val factory = ShoppingViewModelFactory(repository)

        val ViewModel = ViewModelProviders.of(this, factory).get(ShoppingViewModel::class.java)
    }
}