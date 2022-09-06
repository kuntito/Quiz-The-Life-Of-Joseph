package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question153: Question() {
    override val id: Int = 448
    override val question: String = "Who said, \"What shall we say unto my lord? What shall we speak? Or how shall we clear ourselves?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Judah",
        44,
        listOf(16)
    )
    override val option2: String = "Reuben"
    override val option3: String = "Simeon"
    override val option4: String = "Levi"
    override val options: List<String> = shuffledOptions
}
