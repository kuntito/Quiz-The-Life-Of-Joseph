package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question48: Question() {
    override val id: Int = 386
    override val question: String = "Judah went to his sheepshearers at?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Timnath",
        38,
        listOf(12)
    )
    override val option2: String = "Abelmizraim"
    override val option3: String = "Canaan"
    override val option4: String = "Jerusalem"
    override val options: List<String> = shuffledOptions
}
