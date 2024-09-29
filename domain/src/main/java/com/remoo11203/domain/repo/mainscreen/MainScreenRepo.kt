package com.remoo11203.domain.repo.mainscreen

import com.remoo11203.domain.entity.mainscreen.MealModelItems

interface MainScreenRepo {
    suspend fun getMealsFromRemote() : MealModelItems
}