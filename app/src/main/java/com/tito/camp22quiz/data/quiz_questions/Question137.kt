package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question137: Question() {
    override val id: Int = 439
    override val question: String = "Why were Joseph's brothers afraid when they were brought into Joseph's house"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Because of the money that was returned in their sacks",
        43,
        listOf(18)
    )
    override val option2: String = "There were a lot of guards in the house"
    override val option3: String = "They felt intimidated"
    override val option4: String = "They sensed evil would befall them"
    override val options: List<String> = shuffledOptions
}
