package com.sendiko.easycompose.ui.screens

sealed class Routes(val route: String) {
    object SplashScreenRoute: Routes(route = "splashscreen_route")
    object LoginScreenRoute: Routes(route = "loginscreen_route")
    object RegisterScreenRoute: Routes(route = "registerscreen_route")
    object WelcomeScreenRoute: Routes(route = "welcomescreen_route")
}