package com.remoo11203.meals_app_amit_odc.ui.screens.mealdetails

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MealDetailsViewModel @Inject constructor(savedStateHandle: SavedStateHandle) : ViewModel() {

    private val _mealName = MutableStateFlow("")
    val mealName = _mealName.asStateFlow()


    init {
        val mealName = savedStateHandle.get<String>("mealName")

        mealName?.let {
            _mealName.value = it
        }

    }
}