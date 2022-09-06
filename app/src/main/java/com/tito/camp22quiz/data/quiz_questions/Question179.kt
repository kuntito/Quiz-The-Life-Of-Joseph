package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question179: Question() {
    override val id: Int = 474
    override val question: String = "How old was Jacob when he met Pharaoh?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "130 years",
        47,
        listOf(9)
    )
    override val option2: String = "140 years"
    override val option3: String = "120 years"
    override val option4: String = "150 years"
    override val options: List<String> = shuffledOptions
}
