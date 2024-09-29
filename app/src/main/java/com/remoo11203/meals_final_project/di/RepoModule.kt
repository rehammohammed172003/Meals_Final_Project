package com.remoo11203.meals_final_project.di


import com.remoo11203.data.remote.mainscreen.MealsApi
import com.remoo11203.data.repo.mainscreen.MainRepoImpl
import com.remoo11203.domain.repo.mainscreen.MainScreenRepo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideMainScreenRepo(
       api:MealsApi
    ): MainScreenRepo {
        return MainRepoImpl(api)
    }
}