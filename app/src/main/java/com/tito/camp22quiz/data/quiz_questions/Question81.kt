package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question81: Question() {
    override val id: Int = 4017
    override val question: String = "In the baker's dream, What did the three baskets represent?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Three days",
        40,
        listOf(18)
    )
    override val option2: String = "Six days"
    override val option3: String = "Three weeks"
    override val option4: String = "Six weeks"
    override val options: List<String> = shuffledOptions
}
