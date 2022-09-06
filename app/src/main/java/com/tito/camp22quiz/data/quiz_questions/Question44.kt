package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question44: Question() {
    override val id: Int = 382
    override val question: String = "What's the name of Judah's first son?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Er",
        38,
        listOf(3)
    )
    override val option2: String = "Shelah"
    override val option3: String = "Onan"
    override val option4: String = "Hirah"
    override val options: List<String> = shuffledOptions
}
