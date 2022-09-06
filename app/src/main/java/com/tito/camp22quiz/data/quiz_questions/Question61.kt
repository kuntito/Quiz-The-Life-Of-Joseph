package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question61: Question() {
    override val id: Int = 3913
    override val question: String = "What phrase did potiphar's wife use to describe Joseph to Potiphar?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The Hebrew servant",
        39,
        listOf(17)
    )
    override val option2: String = "The Hebrew slave"
    override val option3: String = "The Hebrew worker"
    override val option4: String = "The Uncircumcised Hebrew"
    override val options: List<String> = shuffledOptions
}
