package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question167: Question() {
    override val id: Int = 4513
    override val question: String = "What were the she asses sent to Jacob laden with?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Corn and bread and meat",
        45,
        listOf(23)
    )
    override val option2: String = "Food"
    override val option3: String = "Drinks"
    override val option4: String = "Food and drinks"
    override val options: List<String> = shuffledOptions
}
