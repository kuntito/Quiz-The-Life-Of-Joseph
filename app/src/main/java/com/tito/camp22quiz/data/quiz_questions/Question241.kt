package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question241: Question() {
    override val id: Int = 4919
    override val question: String = "Who is a strong ass couching down between two burdens?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Issachar",
        49,
        listOf(14)
    )
    override val option2: String = "Gad"
    override val option3: String = "Asher"
    override val option4: String = "Zebulun"
    override val options: List<String> = shuffledOptions
}
