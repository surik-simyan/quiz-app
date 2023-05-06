package org.company.quiz.screens.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.company.quiz.screens.ResultScreen

@Composable
fun YesNoComponent(
    clickHandler: (String) -> Unit,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    ) {
        item {
            Button(
                onClick = {
                    clickHandler("Այո")
                },
                modifier = Modifier.heightIn(min = 64.dp).aspectRatio(2.5f),
            ) {
                Text("Այո", textAlign = TextAlign.Center)
            }
        }
        item {
            Button(
                onClick = {
                    clickHandler("Ոչ")
                },
                modifier = Modifier.heightIn(min = 64.dp).aspectRatio(2.5f),
            ) {
                Text("Ոչ", textAlign = TextAlign.Center)
            }
        }
    }
}
