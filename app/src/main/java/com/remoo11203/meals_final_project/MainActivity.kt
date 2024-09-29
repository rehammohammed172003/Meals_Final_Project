package com.remoo11203.meals_final_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.remoo11203.meals_final_project.ui.screens.MainScreen
import com.remoo11203.meals_final_project.ui.screens.mealdetails.MealsDetailsScreen
import com.remoo11203.meals_final_project.ui.theme.Meals_Final_ProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Meals_Final_ProjectTheme {
                MealsAppCompose()
            }
        }
    }
}

@Composable
fun MealsAppCompose() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "mainScreen") {
        composable(Screen.MainScreen.route) { MainScreen(navController) }
        composable(
            route = "${Screen.MealDetailsScreen.route}/{category}?",
            arguments = listOf(
                navArgument("category") { type = NavType.StringType },

                )
        ) { backStackEntry ->
            MealsDetailsScreen(
                category = backStackEntry.arguments?.getString("category") ?: "",

                )
        }


    }
}
