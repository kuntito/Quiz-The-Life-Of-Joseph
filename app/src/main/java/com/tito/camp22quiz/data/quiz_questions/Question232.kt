package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question232: Question() {
    override val id: Int = 4910
    override val question: String = "Jacob said the sceptre shall not depart from _____________ and a ____________ from between his feet"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Judah, Lawgiver",
        49,
        listOf(10)
    )
    override val option2: String = "Joseph, Child"
    override val option3: String = "Joseph, Staff"
    override val option4: String = "Dan, Child"
    override val options: List<String> = shuffledOptions
}
