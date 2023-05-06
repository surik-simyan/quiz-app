package org.company.quiz.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.company.quiz.data.MultipleChoiceQuestion
import org.company.quiz.data.SingleAnswerQuestion
import org.company.quiz.data.YesNoQuestion
import org.company.quiz.screens.components.MultipleChoiceComponent
import org.company.quiz.screens.components.SingleAnswerComponent
import org.company.quiz.screens.components.YesNoComponent

class QuizScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val screenModel = rememberScreenModel { QuizScreenModel() }
        val currentQuestion by screenModel.currentQuestion.collectAsState()
        val answerClick: (String) -> Unit = { answer ->
            screenModel.nextQuestion(answer, finishQuiz = {
                navigator.push(ResultScreen(it))
            })
        }

        Scaffold {
            Column(
                modifier = Modifier.fillMaxSize().padding(64.dp),
            ) {
                Row(
                    modifier = Modifier.fillMaxSize().weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                ) {
                    Text(currentQuestion.question, textAlign = TextAlign.Center)
                }
                Row(
                    modifier = Modifier.fillMaxSize().weight(2f),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    when (currentQuestion) {
                        is SingleAnswerQuestion -> SingleAnswerComponent(answerClick)
                        is YesNoQuestion -> YesNoComponent(answerClick)
                        is MultipleChoiceQuestion -> MultipleChoiceComponent(
                            (currentQuestion as MultipleChoiceQuestion).options,
                            answerClick,
                        )
                    }
                }
            }
        }
    }
}
