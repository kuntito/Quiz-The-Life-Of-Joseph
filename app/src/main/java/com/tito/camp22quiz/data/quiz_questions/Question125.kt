package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question125: Question() {
    override val id: Int = 4216
    override val question: String = "What was Jacob's reaction when he realized their money had been returned?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He was afraid",
        42,
        listOf(35)
    )
    override val option2: String = "He was happy"
    override val option3: String = "He was confused"
    override val option4: String = "He was satisfied"
    override val options: List<String> = shuffledOptions
}
