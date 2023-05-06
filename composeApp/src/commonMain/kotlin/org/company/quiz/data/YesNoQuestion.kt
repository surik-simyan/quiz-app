package org.company.quiz.data

class YesNoQuestion(
    override val question: String,
    private val isAnswerYes: Boolean,
) : Question() {

    override fun validateAnswer(answer: String): Boolean {
        return answer == if (isAnswerYes) "Այո" else "Ոչ"
    }
}
