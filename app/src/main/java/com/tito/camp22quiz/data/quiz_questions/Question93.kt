package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question93: Question() {
    override val id: Int = 4111
    override val question: String = "What did the seven good kine represent?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Seven years",
        41,
        listOf(26)
    )
    override val option2: String = "Seven days"
    override val option3: String = "Seven weeks"
    override val option4: String = "Seven months"
    override val options: List<String> = shuffledOptions
}
