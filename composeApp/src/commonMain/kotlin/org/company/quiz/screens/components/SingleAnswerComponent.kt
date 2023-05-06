package org.company.quiz.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SingleAnswerComponent(
    clickHandler: (String) -> Unit,
) {
    var answer by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextField(
            value = answer,
            onValueChange = {
                answer = it
            },
        )
        Spacer(modifier = Modifier.heightIn(32.dp))
        Button(
            onClick = {
                clickHandler(answer)
            },
            modifier = Modifier.heightIn(min = 64.dp),
        ) {
            Text("Հաջորդ")
        }
    }
}
