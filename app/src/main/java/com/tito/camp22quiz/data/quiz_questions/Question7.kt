package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question7: Question() {
    override val id: Int = 377
    override val question: String = "Who were referred to as Joseph's brethren"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His brothers",
        37,
        listOf(2)
    )
    override val option2: String = "His fellow prisoners"
    override val option3: String = "The chief butler and chief baker"
    override val option4: String = "Potiphar's workers"
    override val options: List<String> = shuffledOptions
}
