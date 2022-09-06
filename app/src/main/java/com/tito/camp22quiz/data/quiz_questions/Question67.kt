package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question67: Question() {
    override val id: Int = 403
    override val question: String = "Where was the chief baker imprisoned?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "In the house of the captain of the guard",
        40,
        listOf(3)
    )
    override val option2: String = "In the prison"
    override val option3: String = "In Pharaoh's special prison"
    override val option4: String = "In the tomb of Sekbeth"
    override val options: List<String> = shuffledOptions
}
