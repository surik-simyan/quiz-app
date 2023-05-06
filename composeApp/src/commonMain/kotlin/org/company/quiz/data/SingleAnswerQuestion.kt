package org.company.quiz.data

class SingleAnswerQuestion(
    override val question: String,
    private val possibleCorrectAnswers: List<String>,
) : Question() {
    override fun validateAnswer(answer: String): Boolean {
        return possibleCorrectAnswers.any { it.lowercase() == answer.lowercase() }
    }
}
