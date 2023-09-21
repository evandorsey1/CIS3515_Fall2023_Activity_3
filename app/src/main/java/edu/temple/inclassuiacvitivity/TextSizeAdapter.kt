package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


// BaseAdapter is a class
class TextSizeAdapter(private val context: Context, private val textSizes: Array<Int>) : BaseAdapter (){



    override fun getCount() = textSizes.size


    override fun getItem(position: Int)= textSizes[position]


    override fun getItemId(position: Int) = position.toLong()


    override fun getView(position: Int, convertView: View?, p2: ViewGroup?): View {
        val textView = TextView(context)

        textView.text = textSizes[position].toString()
        textView.textSize = textSizes[position].toFloat()
        textView.setPadding(5, 10, 0, 10)

        return textView
    }


}