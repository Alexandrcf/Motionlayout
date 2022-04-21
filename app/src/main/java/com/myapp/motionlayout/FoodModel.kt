package com.myapp.motionlayout

data class FoodModel(
    val title: String,
    val description: String,
    val calories: String,
    val rate: String,
    val imgId: Int
)

val foodData: ArrayList<FoodModel> = arrayListOf(
    FoodModel(
        "Салат с лососем",
        "Лосось с овощами — идеальное сочетание для полноценного питания. Простой рецепт блюда, которое содержит в себе богатый набор питательных веществ: белки, жиры и клетчатку.",
        "80 ккал",
        "4.5",
        R.drawable.plate_1
    )
)