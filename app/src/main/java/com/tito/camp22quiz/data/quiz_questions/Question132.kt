package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question132: Question() {
    override val id: Int = 434
    override val question: String = "Which of these is NOT among the items Jacob asked Joseph's brothers to take to Egypt?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Grapes",
        43,
        listOf(11)
    )
    override val option2: String = "Spices"
    override val option3: String = "Myrrh"
    override val option4: String = "Almonds"
    override val options: List<String> = shuffledOptions
}
