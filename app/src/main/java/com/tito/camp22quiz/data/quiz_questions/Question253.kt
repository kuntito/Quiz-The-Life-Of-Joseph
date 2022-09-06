package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question253: Question() {
    override val id: Int = 4931
    override val question: String = "What shall be on the head of Joseph according to Jacob in Gen 49?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The blessings of his father",
        49,
        listOf(26)
    )
    override val option2: String = "The blessings of usman"
    override val option3: String = "The blessings of christ"
    override val option4: String = "The blessings of Abraham"
    override val options: List<String> = shuffledOptions
}
