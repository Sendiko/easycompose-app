package com.sendiko.easycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sendiko.easycompose.ui.screens.LoginScreen
import com.sendiko.easycompose.ui.screens.Routes
import com.sendiko.easycompose.ui.screens.SplashScreen
import com.sendiko.easycompose.ui.screens.WelcomeScreen
import com.sendiko.easycompose.ui.theme.EasyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            EasyComposeTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = Routes.SplashScreenRoute.route,
                        builder = {
                            composable(
                                route = Routes.SplashScreenRoute.route,
                                content = {
                                    SplashScreen {
                                        navController.navigate(Routes.WelcomeScreenRoute.route)
                                    }
                                }
                            )
                            composable(
                                route = Routes.WelcomeScreenRoute.route,
                                content = {
                                    WelcomeScreen(
                                        onNavigate = { route ->
                                            navController.navigate(route)
                                        }
                                    )
                                }
                            )
                            composable(
                                route = Routes.LoginScreenRoute.route,
                                content = {
                                    LoginScreen()
                                }
                            )
                            composable(
                                route = Routes.RegisterScreenRoute.route,
                                content = {

                                }
                            )
                        }
                    )
                }
            }
        }
    }
}