package com.hikizan.mybeginnersubmission

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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

        listFoodAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Food) {
                showSelectedFood(data)
            }
        })
    }

    private fun showSelectedFood(food: Food){
        val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_DATA, food)
        startActivity(moveWithDataIntent)
    }
}