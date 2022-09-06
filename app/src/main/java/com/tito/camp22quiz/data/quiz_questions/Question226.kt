package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question226: Question() {
    override val id: Int = 494
    override val question: String = "Who went up to Jacob's couch?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Reuben",
        49,
        listOf(3,4)
    )
    override val option2: String = "Judah"
    override val option3: String = "Simeon"
    override val option4: String = "Ephraim"
    override val options: List<String> = shuffledOptions
}
