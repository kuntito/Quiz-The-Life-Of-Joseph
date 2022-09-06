package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question112: Question() {
    override val id: Int = 423
    override val question: String = "How many of Joseph's brethren went to Egypt to buy food?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Ten",
        42,
        listOf(2)
    )
    override val option2: String = "Eight"
    override val option3: String = "Nine"
    override val option4: String = "Six"
    override val options: List<String> = shuffledOptions
}
