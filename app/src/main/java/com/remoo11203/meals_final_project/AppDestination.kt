package com.remoo11203.meals_final_project

sealed class Screen(val route : String){
    object MainScreen : Screen("mainScreen")
    object MealDetailsScreen : Screen("mealDetailsScreen")
}