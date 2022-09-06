package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question267: Question() {
    override val id: Int = 4935
    override val question: String = "Where was leah buried?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The cave in the field of macpelah",
        49,
        listOf(32)
    )
    override val option2: String = "The cave of Lamela"
    override val option3: String = "The field of David villa"
    override val option4: String = "The field in the cave of Zanzibar"
    override val options: List<String> = shuffledOptions
}
