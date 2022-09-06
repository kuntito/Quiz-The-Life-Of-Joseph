package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question223: Question() {
    override val id: Int = 491
    override val question: String = "Why did Jacob gather together his sons?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "So he may tell them what would befall them in the last days",
        49,
        listOf(1)
    )
    override val option2: String = "So he could fortell the events of his demise"
    override val option3: String = "So he could see them before he died"
    override val option4: String = "So he could tell them of their inheritance"
    override val options: List<String> = shuffledOptions
}
