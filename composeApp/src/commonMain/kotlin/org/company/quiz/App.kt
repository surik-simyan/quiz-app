package org.company.quiz

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.company.quiz.screens.HomeScreen

@OptIn(ExperimentalAnimationApi::class)
@Composable
internal fun App() = AppTheme {
    Navigator(HomeScreen()) { navigator ->
        SlideTransition(navigator)
    }
}
