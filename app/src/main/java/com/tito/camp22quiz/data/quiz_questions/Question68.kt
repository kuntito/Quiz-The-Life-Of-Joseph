package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question68: Question() {
    override val id: Int = 404
    override val question: String = "Where was the chief butler imprisoned?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "In the house of the captain of the guard",
        40,
        listOf(3)
    )
    override val option2: String = "In the prison"
    override val option3: String = "In the tomb of Sekbeth"
    override val option4: String = "In Pharaoh's special prison"
    override val options: List<String> = shuffledOptions
}
