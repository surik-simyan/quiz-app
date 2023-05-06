package org.company.quiz.screens

import cafe.adriel.voyager.core.model.ScreenModel
import io.github.aakira.napier.Napier
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import org.company.quiz.data.Question

class QuizScreenModel : ScreenModel {
    private val questions = ArrayDeque(Question.questions)

    private val _currentQuestion: MutableStateFlow<Question> = MutableStateFlow(questions.removeFirst())
    val currentQuestion: StateFlow<Question>
        get() = _currentQuestion

    private val _counter: MutableStateFlow<Int> = MutableStateFlow(0)

    fun nextQuestion(answer: String, finishQuiz: (Int) -> Unit) {
        Napier.d(tag = "QuestionCast") { "Questions: " + _currentQuestion.value.toString() }
        if (_currentQuestion.value.validateAnswer(answer)) _counter.update { _counter.value + 1 }
        if (questions.isEmpty()) {
            finishQuiz.invoke(_counter.value)
        } else {
            _currentQuestion.update { questions.removeFirst() }
        }
    }
}
