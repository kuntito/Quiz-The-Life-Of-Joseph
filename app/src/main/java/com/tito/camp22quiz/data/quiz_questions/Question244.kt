package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question244: Question() {
    override val id: Int = 4922
    override val question: String = "Who did Jacob say would be a serpent by the way?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Dan",
        49,
        listOf(17)
    )
    override val option2: String = "Gad"
    override val option3: String = "Asher"
    override val option4: String = "Levi"
    override val options: List<String> = shuffledOptions
}
