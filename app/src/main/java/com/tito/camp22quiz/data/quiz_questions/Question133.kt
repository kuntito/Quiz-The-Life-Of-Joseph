package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question133: Question() {
    override val id: Int = 435
    override val question: String = "Which of these is NOT among the items Jacob asked Joseph's brothers to take to Egypt?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Alopecia",
        43,
        listOf(11)
    )
    override val option2: String = "Honey"
    override val option3: String = "Balm"
    override val option4: String = "Fruits"
    override val options: List<String> = shuffledOptions
}
