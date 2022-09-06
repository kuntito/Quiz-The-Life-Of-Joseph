package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question210: Question() {
    override val id: Int = 507
    override val question: String = "How long did Joseph mourn at the threshing floor?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Seven days",
        50,
        listOf(10)
    )
    override val option2: String = "Seventeen days"
    override val option3: String = "Twelve days"
    override val option4: String = "Six days"
    override val options: List<String> = shuffledOptions
}
