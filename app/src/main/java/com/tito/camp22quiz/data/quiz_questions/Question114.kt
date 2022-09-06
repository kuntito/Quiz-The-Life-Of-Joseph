package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question114: Question() {
    override val id: Int = 425
    override val question: String = "What was Joseph's position in Egypt?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Governor",
        42,
        listOf(6)
    )
    override val option2: String = "Princial"
    override val option3: String = "Chief"
    override val option4: String = "Senator"
    override val options: List<String> = shuffledOptions
}
