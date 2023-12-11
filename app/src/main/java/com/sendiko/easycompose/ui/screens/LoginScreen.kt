package com.sendiko.easycompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sendiko.easycompose.R
import com.sendiko.easycompose.ui.components.CustomTextField
import com.stevdzasan.messagebar.ContentWithMessageBar
import com.stevdzasan.messagebar.rememberMessageBarState

@Composable
fun LoginScreen() {
    val messageBarState = rememberMessageBarState()
    ContentWithMessageBar(
        messageBarState = messageBarState,
        content = {
            Box(
                modifier = Modifier.padding(top = 32.dp),
                contentAlignment = Alignment.TopCenter,
                content = {
                    Image(
                        painter = painterResource(id = R.drawable.login_rectangle),
                        contentDescription = null,
                        modifier = Modifier.scale(1.5f, 1.5f)
                    )
                    Text(
                        text = "Welcome to EasyCompose!",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Box(
                        modifier = Modifier.fillMaxSize().padding(horizontal = 32.dp),
                        contentAlignment = Alignment.Center,
                        content = {
                            ElevatedCard {
                                Column(
                                    modifier = Modifier.padding(16.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    content = {
                                        Text(text = "Masuk", modifier = Modifier.fillMaxWidth())
                                        Spacer(modifier = Modifier.height(8.dp))
                                        CustomTextField(
                                            value = "",
                                            onValueChange = {

                                            },
                                            leadingIcon = Icons.Default.Person,
                                            trailingIcon = {
                                                IconButton(
                                                    onClick = { /*TODO*/ },
                                                    content = {
                                                        Icon(
                                                            Icons.Default.Clear,
                                                            contentDescription = null
                                                        )
                                                    }
                                                )
                                            }
                                        )
                                        Spacer(modifier = Modifier.height(8.dp))
                                        CustomTextField(
                                            value = "",
                                            onValueChange = {},
                                            leadingIcon = Icons.Default.Person,
                                            trailingIcon = {
                                                IconButton(
                                                    onClick = { /*TODO*/ },
                                                    content = {
                                                        Icon(
                                                            Icons.Default.Clear,
                                                            contentDescription = null
                                                        )
                                                    }
                                                )
                                            }
                                        )
                                        Spacer(modifier = Modifier.height(16.dp))
                                        Button(
                                            onClick = { /*TODO*/ },
                                            content = {
                                                Text(text = "Masuk")
                                            }
                                        )
                                    }
                                )
                            }
                        }
                    )
                }
            )
        }
    )
}