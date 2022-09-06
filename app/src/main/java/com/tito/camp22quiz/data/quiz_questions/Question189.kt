package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question189: Question() {
    override val id: Int = 4714
    override val question: String = "How long did Jacob live in Egypt?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Seventeen years",
        47,
        listOf(28)
    )
    override val option2: String = "Two days"
    override val option3: String = "Eighteen years"
    override val option4: String = "Twenty years"
    override val options: List<String> = shuffledOptions
}
