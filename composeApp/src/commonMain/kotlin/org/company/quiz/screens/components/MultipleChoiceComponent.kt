package org.company.quiz.screens.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.company.quiz.data.MultipleChoiceQuestion

@Composable
fun MultipleChoiceComponent(
    options: List<MultipleChoiceQuestion.Option>,
    clickHandler: (String) -> Unit,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    ) {
        items(items = options) { option ->
            Button(
                onClick = {
                    clickHandler(option.text)
                },
                modifier = Modifier.heightIn(min = 64.dp).widthIn(max = 256.dp).aspectRatio(3f),
            ) {
                Text(option.text, textAlign = TextAlign.Center)
            }
        }
    }
}
