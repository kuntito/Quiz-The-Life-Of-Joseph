package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question192: Question() {
    override val id: Int = 482
    override val question: String = "Where did God appear to Jacob and tell him he will make him fruitful"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Luz",
        48,
        listOf(3)
    )
    override val option2: String = "Luda"
    override val option3: String = "Luk"
    override val option4: String = "Luis"
    override val options: List<String> = shuffledOptions
}
