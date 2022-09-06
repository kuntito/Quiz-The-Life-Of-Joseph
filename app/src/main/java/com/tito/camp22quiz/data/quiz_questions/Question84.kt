package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question84: Question() {
    override val id: Int = 412
    override val question: String = "Where did the well favoured kine feed?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "In a meadow",
        41,
        listOf(2)
    )
    override val option2: String = "In the field"
    override val option3: String = "In front of Pharaoh"
    override val option4: String = "In green pastures"
    override val options: List<String> = shuffledOptions
}
