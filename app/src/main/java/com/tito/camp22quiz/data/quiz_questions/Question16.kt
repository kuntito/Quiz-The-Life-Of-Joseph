package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question16: Question() {
    override val id: Int = 3716
    override val question: String = "What did Jacob do after hearing the second dream?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Jacob  observed the saying",
        37,
        listOf(11)
    )
    override val option2: String = "Jacob doubted the saying"
    override val option3: String = "Jacob believed the saying"
    override val option4: String = "Jacob laughed at the saying"
    override val options: List<String> = shuffledOptions
}
