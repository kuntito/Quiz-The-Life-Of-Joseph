package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question122: Question() {
    override val id: Int = 4213
    override val question: String = "Who waited behind in Egypt when Joseph's brothers came to buy corn?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Simeon",
        42,
        listOf(24)
    )
    override val option2: String = "Asher"
    override val option3: String = "Issachar"
    override val option4: String = "Zebulun"
    override val options: List<String> = shuffledOptions
}
