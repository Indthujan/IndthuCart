package com.indthudev.indthucart.ui

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import com.indthudev.indthucart.R
import com.indthudev.indthucart.data.db.entities.ShoppingItem
import kotlinx.android.synthetic.main.add_item_dialog.*

class ShoppingItemDialog(context: Context, var dialogListener: DialogListener) :
    AppCompatDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_item_dialog)

        tvAdd.setOnClickListener {
            val name = etName.text.toString()
            val amount = etAmount.text.toString()

            if (name.isEmpty() || amount.isEmpty()) {
                Toast.makeText(context, "Please enter the data", Toast.LENGTH_SHORT).show()

                return@setOnClickListener
            }

            val item = ShoppingItem(name, amount.toInt())
            dialogListener.onAddClicked(item)
            dismiss()
        }

        tvCancel.setOnClickListener {
            cancel()
        }
    }
}