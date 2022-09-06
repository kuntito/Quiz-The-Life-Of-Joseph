package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question119: Question() {
    override val id: Int = 4210
    override val question: String = "How many days did Joseph's brothers spend in ward?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Three days",
        42,
        listOf(17)
    )
    override val option2: String = "Four days"
    override val option3: String = "Six days"
    override val option4: String = "Seven days"
    override val options: List<String> = shuffledOptions
}
