package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question183: Question() {
    override val id: Int = 478
    override val question: String = "How much money did Joseph gather in Egypt?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "All the money",
        47,
        listOf(14)
    )
    override val option2: String = "one-fifth of the money"
    override val option3: String = "one-third of the money"
    override val option4: String = "two-thirds of the money"
    override val options: List<String> = shuffledOptions
}
