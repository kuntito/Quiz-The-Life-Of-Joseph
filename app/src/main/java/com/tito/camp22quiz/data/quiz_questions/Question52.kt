package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question52: Question() {
    override val id: Int = 394
    override val question: String = "What did Joseph find in Potiphar's sight?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Grace",
        39,
        listOf(4)
    )
    override val option2: String = "Mercy"
    override val option3: String = "Good deeds"
    override val option4: String = "Blessings"
    override val options: List<String> = shuffledOptions
}
