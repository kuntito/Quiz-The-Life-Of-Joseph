package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question54: Question() {
    override val id: Int = 396
    override val question: String = "The blessing of the LORD was upon all Pharaoh had in"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The house and the field",
        39,
        listOf(5)
    )
    override val option2: String = "The field and the prison"
    override val option3: String = "The prison and the house"
    override val option4: String = "The house"
    override val options: List<String> = shuffledOptions
}
