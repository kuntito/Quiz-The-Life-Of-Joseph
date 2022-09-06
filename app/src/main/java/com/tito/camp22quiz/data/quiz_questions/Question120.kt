package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question120: Question() {
    override val id: Int = 4211
    override val question: String = "What was Joseph's reason for releasing his brothers from prison?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He feared God",
        42,
        listOf(18)
    )
    override val option2: String = "He was merciful"
    override val option3: String = "He was tired of punishing them"
    override val option4: String = "They were getting hungry"
    override val options: List<String> = shuffledOptions
}
