package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question18: Question() {
    override val id: Int = 3718
    override val question: String = "Where did Jacob believe his sons were feeding the flock at?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Shechem",
        37,
        listOf(12)
    )
    override val option2: String = "Dothan"
    override val option3: String = "Abelmizraim"
    override val option4: String = "Padan"
    override val options: List<String> = shuffledOptions
}
