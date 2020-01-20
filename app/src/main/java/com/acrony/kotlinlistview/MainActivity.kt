package com.acrony.kotlinlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayofcourse=arrayOf("Java","Kotlin","PHP","Flutter","C#")

        val courseAdapter=ArrayAdapter(this,R.layout.lvitems,arrayofcourse)

        val listView:ListView=findViewById(R.id.lvcourse)

        listView.setAdapter(courseAdapter)


        listView.onItemClickListener=object :AdapterView.OnItemClickListener{

            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val CourseValue=listView.getItemAtPosition(position) as String

                Toast.makeText(applicationContext,"Selected Course :" +CourseValue,Toast.LENGTH_LONG).show()
                intent= Intent(this@MainActivity,Activity2::class.java)
                startActivity(intent)
            }


        }

    }
}
