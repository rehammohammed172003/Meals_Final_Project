package com.remoo11203.data.repo.mainscreen

import com.remoo11203.data.remote.mainscreen.MealsApi
import com.remoo11203.domain.entity.mainscreen.MealModelItems
import com.remoo11203.domain.repo.mainscreen.MainScreenRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainRepoImpl (private val mealsApi: MealsApi) : MainScreenRepo {
    override suspend fun getMealsFromRemote(): MealModelItems = withContext(Dispatchers.IO){
        return@withContext mealsApi.getMeals()
    }
}