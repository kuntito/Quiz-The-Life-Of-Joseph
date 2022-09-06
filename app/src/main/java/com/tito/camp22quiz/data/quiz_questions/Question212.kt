package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question212: Question() {
    override val id: Int = 509
    override val question: String = "How long did Joseph live?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "110 years",
        50,
        listOf(22)
    )
    override val option2: String = "120 years"
    override val option3: String = "130 years"
    override val option4: String = "140 years"
    override val options: List<String> = shuffledOptions
}
