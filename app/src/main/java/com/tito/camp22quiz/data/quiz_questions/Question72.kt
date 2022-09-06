package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question72: Question() {
    override val id: Int = 408
    override val question: String = "In the butler's dream, The clusters of the vine brought forth ripe …"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Grapes",
        40,
        listOf(10)
    )
    override val option2: String = "Berries"
    override val option3: String = "Melons"
    override val option4: String = "Fruits"
    override val options: List<String> = shuffledOptions
}
