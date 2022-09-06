package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question63: Question() {
    override val id: Int = 3915
    override val question: String = "What was Joseph given in the sight of the prison keeper?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Favour",
        39,
        listOf(21)
    )
    override val option2: String = "Mercy"
    override val option3: String = "Grace"
    override val option4: String = "Chains"
    override val options: List<String> = shuffledOptions
}
