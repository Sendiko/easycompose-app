package com.sendiko.easycompose.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    buttonType: ButtonType = ButtonType.Solid,
    textDecoration: TextDecoration = TextDecoration.None,
    onClick: () -> Unit,
    color: Color,
    text: String
) {
    if (buttonType == ButtonType.Solid){
        Button(
            modifier = modifier,
            colors = ButtonDefaults.buttonColors(
                containerColor = color,
                contentColor = Color.White
            ),
            onClick = onClick,
            content= {
                Text(text = text)
            }
        )
    }
    if (buttonType == ButtonType.Outlined){
        OutlinedButton(
            modifier = modifier,
            onClick = onClick,
            content= {
                Text(text = text)
            }
        )
    }
    if (buttonType == ButtonType.TextButton){
        TextButton(
            modifier = modifier,
            onClick = onClick,
            content = {
                Text(text = text, textDecoration = textDecoration)
            }
        )
    }
}