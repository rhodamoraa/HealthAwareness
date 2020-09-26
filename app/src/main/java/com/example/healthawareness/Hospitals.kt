package com.example.healthawareness

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_hospitals.*

class Hospitals : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospitals)

        val hospitals= arrayOf<String>("KNH","Mater","Aghakan","Nairobi Hospital","Meridian","Mediheal")

        //we need an adapter
        val arrayAdapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hospitals)

        //put this adapter to your list

        listhosi.adapter=arrayAdapter
        //set a list listener
        listhosi.onItemClickListener=AdapterView.OnItemClickListener {parent: AdapterView<*>?, view: View?, position: Int, l: Long ->
      //position is what was clickd whn counting from 0
       if (position==0){
           val i=Intent(Intent.ACTION_VIEW, Uri.parse("geo:-1.301301,36.8069899z=15 ")) //knh
           startActivity(i)
       }
            if (position==1){
                val i=Intent(Intent.ACTION_VIEW, Uri.parse("geo:-1297486,36854346,3159z=15 "))//mater
                startActivity(i)
        };
    }
}
}