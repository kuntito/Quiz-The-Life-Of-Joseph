package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question33: Question() {
    override val id: Int = 3733
    override val question: String = "The people who bought Joseph were going to?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Egypt",
        37,
        listOf(25)
    )
    override val option2: String = "Gilead"
    override val option3: String = "Kadesh"
    override val option4: String = "Midian"
    override val options: List<String> = shuffledOptions
}
