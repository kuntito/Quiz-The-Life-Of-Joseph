package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question213: Question() {
    override val id: Int = 5010
    override val question: String = "How many generations of Ephraim's children did Joseph see?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Three",
        50,
        listOf(23)
    )
    override val option2: String = "Four"
    override val option3: String = "One"
    override val option4: String = "Two"
    override val options: List<String> = shuffledOptions
}
