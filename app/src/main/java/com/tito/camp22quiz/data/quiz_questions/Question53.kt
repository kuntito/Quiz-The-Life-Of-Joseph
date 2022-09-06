package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question53: Question() {
    override val id: Int = 395
    override val question: String = "All Potiphar had, he put in Joseph's"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Hand",
        39,
        listOf(4)
    )
    override val option2: String = "Care"
    override val option3: String = "Supervision"
    override val option4: String = "Leg"
    override val options: List<String> = shuffledOptions
}
