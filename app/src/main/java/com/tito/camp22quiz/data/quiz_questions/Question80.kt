package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question80: Question() {
    override val id: Int = 4016
    override val question: String = "From which basket did the birds eat from?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The uppermost basket",
        40,
        listOf(17)
    )
    override val option2: String = "The second basket"
    override val option3: String = "The brown basket"
    override val option4: String = "The crimson basket"
    override val options: List<String> = shuffledOptions
}
