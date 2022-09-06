package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question78: Question() {
    override val id: Int = 4014
    override val question: String = "In the chief baker's dream, what were the color of the baskets?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "White",
        40,
        listOf(16)
    )
    override val option2: String = "Black"
    override val option3: String = "Brown"
    override val option4: String = "Crimson"
    override val options: List<String> = shuffledOptions
}
