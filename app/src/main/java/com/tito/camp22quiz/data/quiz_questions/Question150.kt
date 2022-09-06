package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question150: Question() {
    override val id: Int = 445
    override val question: String = "Joseph's brothers said \"With whomsoever of thy servant it be found, both let him die, and we also will be ________\""
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Bondmen",
        44,
        listOf(9)
    )
    override val option2: String = "Helpers"
    override val option3: String = "Slaves"
    override val option4: String = "Servants"
    override val options: List<String> = shuffledOptions
}
