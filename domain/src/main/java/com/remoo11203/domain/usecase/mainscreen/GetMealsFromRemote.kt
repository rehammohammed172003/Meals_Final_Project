package com.remoo11203.domain.usecase.mainscreen

import com.remoo11203.domain.entity.mainscreen.MealModelItems
import com.remoo11203.domain.repo.mainscreen.MainScreenRepo

class GetMealsFromRemote (private val mainScreenRepo: MainScreenRepo) {
   suspend operator fun invoke(): MealModelItems = mainScreenRepo.getMealsFromRemote()
}
