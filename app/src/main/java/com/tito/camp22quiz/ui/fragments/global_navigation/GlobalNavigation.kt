package com.tito.camp22quiz.ui.fragments.global_navigation

import android.util.Log
import androidx.navigation.NavController
import com.tito.camp22quiz.R

object GlobalNavigation {
    fun goToHomeScreen(navController: NavController){
        navController.navigate(R.id.action_global_homeScreenFragment)
    }
    fun goToSearchFragment(navController: NavController){
        navController.navigate(R.id.action_global_searchFragment)
    }

}