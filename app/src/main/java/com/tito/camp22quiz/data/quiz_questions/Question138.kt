package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question138: Question() {
    override val id: Int = 4310
    override val question: String = "\"we cannot tell who put the money in our sacks\", who did Joseph's brothers make this statement to?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The steward of the house",
        43,
        listOf(19,20,21,22)
    )
    override val option2: String = "Joseph"
    override val option3: String = "Pharaoh"
    override val option4: String = "David"
    override val options: List<String> = shuffledOptions
}
