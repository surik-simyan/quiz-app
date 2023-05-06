package org.company.quiz.data

class MultipleChoiceQuestion(
    override val question: String,
    val options: List<Option>,
) : Question() {
    override fun validateAnswer(answer: String): Boolean {
        return options.first { it.isCorrect }.text == answer
    }

    class Option(val text: String, val isCorrect: Boolean)
}
