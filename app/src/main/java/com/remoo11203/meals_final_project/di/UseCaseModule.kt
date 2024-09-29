package com.remoo11203.meals_final_project.di

import com.remoo11203.domain.repo.mainscreen.MainScreenRepo
import com.remoo11203.domain.usecase.mainscreen.GetMealsFromRemote
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    //Main
    @Provides
    fun provideGetMealsFromRemoteUseCase(mainRepo: MainScreenRepo): GetMealsFromRemote {
        return GetMealsFromRemote(mainRepo)
    }
}