package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question13: Question() {
    override val id: Int = 3713
    override val question: String = "Where were Joseph and his brothers when they were binding sheaves"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "In the field",
        37,
        listOf(7)
    )
    override val option2: String = "In the farm"
    override val option3: String = "At the thresing floor"
    override val option4: String = "At the back of the house"
    override val options: List<String> = shuffledOptions
}
