package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question73: Question() {
    override val id: Int = 409
    override val question: String = "Which best describes the butler's vines?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Three branches, budded, blossoms shot forth, ripe grapes",
        40,
        listOf(10)
    )
    override val option2: String = "Three branches, budded, shot forth ripe berries"
    override val option3: String = "Three branches, budded, blossoms shot forth, ripe berries"
    override val option4: String = "Three branches, ripe melons"
    override val options: List<String> = shuffledOptions
}
