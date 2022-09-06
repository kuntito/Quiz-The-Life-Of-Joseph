package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question27: Question() {
    override val id: Int = 3727
    override val question: String = "Who wanted to save Joseph?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Reuben",
        37,
        listOf(21)
    )
    override val option2: String = "Dan"
    override val option3: String = "Levi"
    override val option4: String = "Naphthali"
    override val options: List<String> = shuffledOptions
}
