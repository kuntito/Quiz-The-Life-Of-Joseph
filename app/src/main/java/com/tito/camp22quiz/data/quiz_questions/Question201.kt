package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question201: Question() {
    override val id: Int = 492
    override val question: String = "According to Jacob, who are instruments of cruelty?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Simeon and Levi",
        49,
        listOf(5)
    )
    override val option2: String = "Levi and Judah"
    override val option3: String = "Reuben and Simeon"
    override val option4: String = "James, the son of Alpheus"
    override val options: List<String> = shuffledOptions
}
