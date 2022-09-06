package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question32: Question() {
    override val id: Int = 3732
    override val question: String = "The people who bought Joseph were coming from?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Gilead",
        37,
        listOf(25)
    )
    override val option2: String = "Egypt"
    override val option3: String = "Midian"
    override val option4: String = "Kadesh"
    override val options: List<String> = shuffledOptions
}
