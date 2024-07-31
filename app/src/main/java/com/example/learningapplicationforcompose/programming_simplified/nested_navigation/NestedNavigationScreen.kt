package com.example.learningapplicationforcompose.programming_simplified.nested_navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController


//Splash -> signup -> signin -> dashboard -> profile

// splash -> register -> dashboard -> profile

@Composable
fun NestedNavigationScreen() {

    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = NestedScreen.Splash.route) {

        composable(NestedScreen.Splash.route){
            SplashScreen()
        }

        //nested navigation
        navigation(route = NestedScreen.Register.route,
            startDestination = NestedScreen.Register.SignUp.route) {
            composable(NestedScreen.Register.SignUp.route){
                SignUpScreen()
            }
            composable(NestedScreen.Register.SignIn.route){
                SigninScreen()
            }
        }

        composable(NestedScreen.Profile.route) {
            ProfileScreen()
        }


    }

}


@Composable
fun SplashScreen() {

}

@Composable
fun SignUpScreen() {

}

@Composable
fun SigninScreen() {

}

@Composable
fun ProfileScreen() {

}


sealed class NestedScreen(val route:String) {
    object Splash : NestedScreen("splash")
    object Register : NestedScreen("register") {
        object SignUp : NestedScreen("signUp")
        object SignIn : NestedScreen("signIn")
    }
    object Profile : NestedScreen("profile")

}