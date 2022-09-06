package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question118: Question() {
    override val id: Int = 429
    override val question: String = "What was Joseph's initial plan to test the truthfulness of his brothers statement?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "To send one of them to fetch the youngest while the rest wait in prison",
        42,
        listOf(16)
    )
    override val option2: String = "To ask them a series of personal questions"
    override val option3: String = "To detain them in prison and torture them"
    override val option4: String = "To ask the magicians and high priests for guidance"
    override val options: List<String> = shuffledOptions
}
