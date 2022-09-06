package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question94: Question() {
    override val id: Int = 4112
    override val question: String = "How many years of famine did Joseph speak of?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Seven years",
        41,
        listOf(27)
    )
    override val option2: String = "Seven days"
    override val option3: String = "Seven weeks"
    override val option4: String = "Seven months"
    override val options: List<String> = shuffledOptions
}
