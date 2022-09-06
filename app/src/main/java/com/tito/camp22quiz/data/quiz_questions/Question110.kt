package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question110: Question() {
    override val id: Int = 421
    override val question: String = "Jacob heard there was _____ in egypt"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Corn",
        42,
        listOf(1)
    )
    override val option2: String = "Food"
    override val option3: String = "Grain"
    override val option4: String = "Substance"
    override val options: List<String> = shuffledOptions
}
