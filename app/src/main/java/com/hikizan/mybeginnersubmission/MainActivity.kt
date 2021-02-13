package com.hikizan.mybeginnersubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hikizan.mybeginnersubmission.adapter.ListFoodAdapter
import com.hikizan.mybeginnersubmission.model.Food
import com.hikizan.mybeginnersubmission.model.FoodsData

class MainActivity : AppCompatActivity() {
    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()
    private var title: String = "List Makanan"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFoods = findViewById(R.id.rvFoods)
        rvFoods.setHasFixedSize(true)
        list.addAll(FoodsData.listData)

        showRecyclerList()
        setOnActionBarTitle(title)
    }

    private fun setOnActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showRecyclerList() {
        rvFoods.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(list)
        rvFoods.adapter = listFoodAdapter
    }
}