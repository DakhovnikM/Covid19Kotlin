package com.example.covid19kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.covid19kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var countriesListView: ListView
    lateinit var bindingActivityMain: ActivityMainBinding

    var countries : Array<String> = arrayOf("")
    val count: String = "Привет как дела"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingActivityMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingActivityMain.root)

        //setContentView(R.layout.activity_main)
        //countriesListView = findViewById(R.id.countriesList)
    }

    fun updateClick(view: android.view.View) {
        countries = arrayOf("Бразилия", "Аргентина", "Колумбия", "Чили", "Уругвай")

        var adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, countries
        )

        bindingActivityMain.countriesList.adapter= adapter
        //countriesListView.adapter = adapter
    }


}