package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question227: Question() {
    override val id: Int = 495
    override val question: String = "Who did Jacob regard as instruments of cruelty?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Simeon and Levi",
        49,
        listOf(5)
    )
    override val option2: String = "Judah and Gad"
    override val option3: String = "Naphthali and Asher"
    override val option4: String = "Joseph and Benjamin"
    override val options: List<String> = shuffledOptions
}
