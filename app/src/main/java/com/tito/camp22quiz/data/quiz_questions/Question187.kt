package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question187: Question() {
    override val id: Int = 4712
    override val question: String = "Which land did Joseph not buy?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The land of the priests",
        47,
        listOf(22)
    )
    override val option2: String = "The land of Atad"
    override val option3: String = "The land of Shechem"
    override val option4: String = "The land of Ramsdale"
    override val options: List<String> = shuffledOptions
}
