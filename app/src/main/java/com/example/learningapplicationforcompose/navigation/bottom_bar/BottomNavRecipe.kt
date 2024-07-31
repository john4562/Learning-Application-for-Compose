package com.example.learningapplicationforcompose.navigation.bottom_bar

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainEntryPoint(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Scaffold (bottomBar = {
        MainBottomNavigation(navHostController = navController)
    }) {
        MainNavigation(navHostController = navController)
    }
}


@Composable
fun MainNavigation(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = BottomNavItem.Home.route) {

        composable(BottomNavItem.Home.route) {
            HomeScreen()
        }
        composable(BottomNavItem.Search.route) {
            SearchScreen()
        }
        composable(BottomNavItem.Profile.route) {
            ProfileScreen()
        }
        composable(BottomNavItem.Mail.route) {
            EmailScreen()
        }
        composable(BottomNavItem.Warning.route) {
            WarningScreen()
        }


    }

}

@Composable
fun WarningScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Warning Screen", modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun EmailScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Email Screen", modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun SearchScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Search Screen", modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun ProfileScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Profile Screen", modifier = Modifier.align(Alignment.Center))
    }
}


@Composable
fun HomeScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Home Screen", modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun MainBottomNavigation(navHostController: NavHostController) {

    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Profile,
        BottomNavItem.Warning,
        BottomNavItem.Search,
        BottomNavItem.Mail
    )



    BottomAppBar(containerColor = Color.White, contentColor = Color.White) {

        val navStack by navHostController.currentBackStackEntryAsState()
        val currentRoute = navStack?.destination?.route

        items.forEach { item ->

            NavigationBarItem(label = { Text(text = item.label)},selected = currentRoute == item.route, onClick = {
                navHostController.navigate(item.route) {
                 /*   navHostController.graph?.startDestinationRoute?.let {
                        popUpTo(item.route)
                        launchSingleTop = true
                        restoreState = true
                    }*/
                }

            },
                icon = {
                    BadgedBox(badge = {
                        if (currentRoute == item.route) {
                            Surface(
                                modifier = Modifier.padding(4.dp),
                                shape = CircleShape,
                                color = Color.Red
                            ) {
                                Text(
                                    text = "12",
                                    style = MaterialTheme.typography.labelSmall,
                                    modifier = Modifier.padding(4.dp)
                                )

                            }

                        }

                    }) {
                        Icon(imageVector = item.icon,
                            contentDescription = "",
                            modifier = Modifier.size(20.dp))
                    }
                }, alwaysShowLabel = true
            )


        }


    }


}
