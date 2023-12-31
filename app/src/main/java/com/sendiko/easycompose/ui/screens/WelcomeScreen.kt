package com.sendiko.easycompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sendiko.easycompose.R
import com.sendiko.easycompose.ui.components.ButtonType
import com.sendiko.easycompose.ui.components.CustomButton
import com.sendiko.easycompose.ui.theme.DarkBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomeScreen(
    onNavigate: (route: String) -> Unit
) {
    Scaffold {
        Box(
            modifier = Modifier.padding(it),
            content = {
                Image(
                    painter = painterResource(id = R.drawable.login_rectangle),
                    contentDescription = null,
                    modifier = Modifier.scale(1.5f, 1.5f)
                )
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Welcome to EasyCompose!",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Image(
                        painter = painterResource(id = R.drawable.splash_image),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    )
                    CustomButton(
                        onClick = {
                                  onNavigate(Routes.RegisterScreenRoute.route)
                        },
                        color = DarkBlue,
                        text = "Daftar"
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    CustomButton(
                        onClick = {
                            onNavigate(Routes.LoginScreenRoute.route)
                                  },
                        color = Color.Transparent,
                        text = "Have an account? Login!",
                        buttonType = ButtonType.TextButton,
                        textDecoration = TextDecoration.Underline,
                    )
                }
            }
        )
    }
}