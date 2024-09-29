package com.remoo11203.data.remote.mainscreen

import com.remoo11203.domain.entity.mainscreen.MealModelItems
import retrofit2.http.GET

interface MealsApi {
    @GET("api/json/v1/1/categories.php")
    suspend fun getMeals(): MealModelItems
    //https://www.themealdb.com/
}