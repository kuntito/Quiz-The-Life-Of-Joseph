package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question28: Question() {
    override val id: Int = 3728
    override val question: String = "Who planned to deliver Joseph to Jacob?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Reuben",
        37,
        listOf(22)
    )
    override val option2: String = "Asher"
    override val option3: String = "Dinah"
    override val option4: String = "Issachar"
    override val options: List<String> = shuffledOptions
}
