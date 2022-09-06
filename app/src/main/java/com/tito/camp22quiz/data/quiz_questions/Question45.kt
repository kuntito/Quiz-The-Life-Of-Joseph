package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question45: Question() {
    override val id: Int = 383
    override val question: String = "Where was Judah's son, Shelah born?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Chezib",
        38,
        listOf(5)
    )
    override val option2: String = "Padan"
    override val option3: String = "Midian"
    override val option4: String = "Gilead"
    override val options: List<String> = shuffledOptions
}
