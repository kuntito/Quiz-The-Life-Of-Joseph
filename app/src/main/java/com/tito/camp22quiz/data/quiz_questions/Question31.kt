package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question31: Question() {
    override val id: Int = 3731
    override val question: String = "What were Joseph's brothers eating before they sold him?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Bread",
        37,
        listOf(25)
    )
    override val option2: String = "Grain"
    override val option3: String = "Corn"
    override val option4: String = "Manna"
    override val options: List<String> = shuffledOptions
}
