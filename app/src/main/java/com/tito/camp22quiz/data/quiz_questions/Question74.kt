package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question74: Question() {
    override val id: Int = 4010
    override val question: String = "In the butler's dream, what was in his hand?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Pharaoh's cup",
        40,
        listOf(11)
    )
    override val option2: String = "Joseph's cup"
    override val option3: String = "A silver cup"
    override val option4: String = "Wine cup"
    override val options: List<String> = shuffledOptions
}
