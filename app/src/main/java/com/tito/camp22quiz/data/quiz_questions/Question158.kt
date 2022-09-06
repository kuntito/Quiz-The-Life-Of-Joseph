package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question158: Question() {
    override val id: Int = 454
    override val question: String = "How much of the famine had Joseph's brothers experienced before they met him?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Two years",
        45,
        listOf(6)
    )
    override val option2: String = "Three years"
    override val option3: String = "Like two haars"
    override val option4: String = "Four years"
    override val options: List<String> = shuffledOptions
}
