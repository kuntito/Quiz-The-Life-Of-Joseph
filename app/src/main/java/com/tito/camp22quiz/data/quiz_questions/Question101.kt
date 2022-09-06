package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question101: Question() {
    override val id: Int = 4119
    override val question: String = "What is the name of Joseph's wife?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Asenath",
        41,
        listOf(45)
    )
    override val option2: String = "Tamar"
    override val option3: String = "Rebekah"
    override val option4: String = "Shulamite"
    override val options: List<String> = shuffledOptions
}
