package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question106: Question() {
    override val id: Int = 4124
    override val question: String = "What's the name of Joseph's first born?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Manasseh",
        41,
        listOf(51)
    )
    override val option2: String = "Ephraim"
    override val option3: String = "Shelah"
    override val option4: String = "Er"
    override val options: List<String> = shuffledOptions
}
