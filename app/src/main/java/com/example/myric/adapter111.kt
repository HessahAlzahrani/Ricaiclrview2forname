package com.example.myric

import android.content.Context
import android.service.autofill.Dataset
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

// datasurs111 it's = mian it is mutablelist <data class modea data >

class adapter111  (var context: Context,var datasurs1112: MutableList<modeldatatclass>):
        RecyclerView.Adapter<adapter111.viewHolder>() {



    class viewHolder (view: View):RecyclerView.ViewHolder(view){

        // craet var for eny item on item xml
    var namevarviewholderitem1  =view.findViewById<TextView>(R.id.textViewid)
        var namevarviewholderitem2  =view.findViewById<TextView>(R.id.textView2)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {

        Log.e("TAG", "onCreateViewHolder: " )


        return viewHolder(LayoutInflater.from(parent.context).inflate (R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

    var itemname12 = datasurs1112[position]




        Log.e("TAG", "onBindViewHolder: " )
        Toast.makeText(context, "${itemname12.name}", Toast.LENGTH_SHORT).show()





      holder.namevarviewholderitem1.text = itemname12.name
        holder.namevarviewholderitem2.text = itemname12.number.toString()

    }


    override fun getItemCount(): Int {
    return datasurs1112.size
    }

}



