package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.Text


// BaseAdapter is a class
class TextSizeAdapter(private val context: Context, private val textSizes: Array<Int>) : BaseAdapter (){



    override fun getCount() = textSizes.size


    override fun getItem(position: Int)= textSizes[position]


    override fun getItemId(position: Int) = position.toLong()


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        // // val textView = TextView(context)
//        val textView : TextView
//
//
//        // If we were given a view to recycle...
//        if (convertView != null){
//            textView = convertView as TextView
//        }else {                                      // Else = we are not given a view to recycle
//            textView = TextView(context)
//            textView.setPadding(5, 10, 0, 10)
//        }
//
//        textView.text = textSizes[position].toString()
//        textView.textSize = textSizes[position].toFloat()
//
//        return textView
        return (getDropDownView(position, convertView, parent) as TextView).apply{
            textSize = 22f
        }


    }




    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView


        // If we were given a view to recycle...
        if (convertView != null){
            textView = convertView as TextView
        }else {                                      // Else = we are not given a view to recycle
            textView = TextView(context)
            textView.setPadding(5, 10, 0, 10)
        }

        textView.text = textSizes[position].toString()
        textView.textSize = textSizes[position].toFloat()

        return textView
    }




}