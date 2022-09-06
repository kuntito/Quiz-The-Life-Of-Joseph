package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question197: Question() {
    override val id: Int = 487
    override val question: String = "Who was Joseph's youngest child"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Ephraim",
        48,
        listOf(14)
    )
    override val option2: String = "Manasseh"
    override val option3: String = "Yakub"
    override val option4: String = "Gol. D Roger"
    override val options: List<String> = shuffledOptions
}
