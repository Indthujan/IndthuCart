package com.indthudev.indthucart.ui

import com.indthudev.indthucart.data.db.entities.ShoppingItem

interface DialogListener {

    fun onAddClicked(item: ShoppingItem)
}