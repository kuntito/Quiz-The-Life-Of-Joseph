package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question174: Question() {
    override val id: Int = 465
    override val question: String = "What was the trade of Joseph's brothers from birth?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Shepherds",
        46,
        listOf(32)
    )
    override val option2: String = "Hunters"
    override val option3: String = "Gatherers"
    override val option4: String = "Hustlers"
    override val options: List<String> = shuffledOptions
}
