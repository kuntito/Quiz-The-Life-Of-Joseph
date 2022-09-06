package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question205: Question() {
    override val id: Int = 502
    override val question: String = "How many days were fulfilled for embalming Israel?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "40 days",
        50,
        listOf(2,3)
    )
    override val option2: String = "35 days"
    override val option3: String = "50 days"
    override val option4: String = "70 days"
    override val options: List<String> = shuffledOptions
}
