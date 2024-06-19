package com.kursik.newerabook.presentation.nvgraph

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.kursik.newerabook.presentation.news_navigator.NewsNavigator
import com.kursik.newerabook.presentation.onboarding.OnBoardingScreen
import com.kursik.newerabook.presentation.onboarding.OnBoardingViewModel

@Composable
fun NavGraph(
    startDestination: String,

    ) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ) {
            composable(route = Route.OnBoardingScreen.route) {
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = { event ->
                        viewModel.onEvent(event)
                    }
                )
            }
        }
        navigation(
            route = Route.NewsNavigation.route,
            startDestination = Route.NewsNavigationScreen.route
        ) {
            composable(route = Route.NewsNavigationScreen.route) {
                NewsNavigator()
            }
        }
    }

}