package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question88: Question() {
    override val id: Int = 416
    override val question: String = "Who did Pharaoh call to interpret his dream?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The magicians and wise men",
        41,
        listOf(8)
    )
    override val option2: String = "The priests"
    override val option3: String = "The wise priests"
    override val option4: String = "Joseph"
    override val options: List<String> = shuffledOptions
}
