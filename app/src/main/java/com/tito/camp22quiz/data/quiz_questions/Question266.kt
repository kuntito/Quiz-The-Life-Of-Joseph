package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question266: Question() {
    override val id: Int = 4934
    override val question: String = "Where was Joseph's Paternal Great-Grandmother buried?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The cave in the field of macpelah",
        49,
        listOf(29,30)
    )
    override val option2: String = "The field in the cave of macpelah"
    override val option3: String = "The field in the cave of acapella"
    override val option4: String = "The cave of Mandela"
    override val options: List<String> = shuffledOptions
}
