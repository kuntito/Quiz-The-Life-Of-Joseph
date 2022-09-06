package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question35: Question() {
    override val id: Int = 3735
    override val question: String = "Who suggested they sell Joseph?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Judah",
        37,
        listOf(26)
    )
    override val option2: String = "Simeon"
    override val option3: String = "Issachar"
    override val option4: String = "Asher"
    override val options: List<String> = shuffledOptions
}
