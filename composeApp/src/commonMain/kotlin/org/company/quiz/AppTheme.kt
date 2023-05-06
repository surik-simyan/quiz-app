package org.company.quiz

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.platform.Font
import org.jetbrains.compose.resources.resource

@Composable
internal fun AppTheme(
    content: @Composable () -> Unit,
) {
    var customFontFamily: FontFamily by remember { mutableStateOf(FontFamily.Default) }
    LaunchedEffect(Unit) {
        customFontFamily = FontFamily(
            Font("bokonique_regular.otf", resource("bokonique_regular.otf").readBytes()),
        )
    }

    MaterialTheme(
        typography = Typography(customFontFamily),
        content = content,
    )
}
