package com.example.myric

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import javax.sql.DataSource



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.rid)


        val myDataset = datasurs111().funfordats()
        Log.e("TAG", "onCreate: ${myDataset.size}", )
        recyclerView.adapter = adapter111(this,myDataset)





    }





}

