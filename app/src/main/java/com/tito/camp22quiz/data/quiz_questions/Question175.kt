package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question175: Question() {
    override val id: Int = 466
    override val question: String = "What professions did the Egyptians see as an abomination?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Shepherds",
        46,
        listOf(34)
    )
    override val option2: String = "Hustlers"
    override val option3: String = "Farmers"
    override val option4: String = "Dreamers"
    override val options: List<String> = shuffledOptions
}
