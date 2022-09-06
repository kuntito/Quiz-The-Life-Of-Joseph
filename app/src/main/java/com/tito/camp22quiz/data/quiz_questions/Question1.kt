package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question1: Question() {
    override val id: Int = 371
    override val question: String = "Who was a stranger in the land of canaan?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Jacob's father",
        37,
        listOf(1)
    )
    override val option2: String = "Jacob"
    override val option3: String = "Joseph's father"
    override val option4: String = "Abraham"
    override val options: List<String> = shuffledOptions
}
