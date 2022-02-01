package com.example.examapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examapp.adapter.FoodAdapter
import com.example.examapp.model.FoodModel
import com.example.frendlyeats.R

class MainActivity : AppCompatActivity() {

    lateinit var context:Context
    lateinit var recyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView(){
        context = this
        recyclerView =findViewById(R.id.rv)
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        val foodList : ArrayList<FoodModel> = ArrayList()

        foodList.add(FoodModel(resources.getDrawable(R.drawable.food1), "Stake", "Divan"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food2), "Cheese", "Bursa"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "HotDog", "Evos"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food2), "Breakfast", "Enjoy"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food1), "Stake", "Divan"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food2), "Cheese", "Bursa"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "HotDog", "Evos"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food2), "Breakfast", "Enjoy"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food1), "Stake", "Divan"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food2), "Cheese", "Bursa"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food3), "HotDog", "Evos"))
        foodList.add(FoodModel(resources.getDrawable(R.drawable.food2), "Breakfast", "Enjoy"))
        refreshAdapter(foodList)
    }

    fun refreshAdapter(foodList:ArrayList<FoodModel>) {
        val adapter = FoodAdapter(context, foodList)
        recyclerView.adapter = adapter
    }
}
