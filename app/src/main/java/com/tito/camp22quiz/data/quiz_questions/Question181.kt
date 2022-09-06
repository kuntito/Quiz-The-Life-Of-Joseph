package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question181: Question() {
    override val id: Int = 476
    override val question: String = "Joseph gave his father and his brothers possessions in the best land, the land of __________"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Rameses",
        47,
        listOf(11)
    )
    override val option2: String = "Anubis"
    override val option3: String = "Isis"
    override val option4: String = "Horus"
    override val options: List<String> = shuffledOptions
}
