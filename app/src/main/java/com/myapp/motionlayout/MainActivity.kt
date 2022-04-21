package com.myapp.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.myapp.motionlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTitle.text = "Салат с лососем"
        binding.tvDescription.text = "Лосось с овощами — идеальное сочетание для полноценного питания. " +
                "Простой рецепт блюда, которое содержит в себе богатый набор питательных веществ: белки, жиры и клетчатку."
        binding.tvCalories.text = "80 ккал"
        binding.tvRate.text = "4.5"
        binding.ivFood.setImageResource(R.drawable.plate_1)

    }

    fun start(view: View) {
        binding.motionLayout.transitionToState(R.id.ivFood)
    }
}