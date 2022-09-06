package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question87: Question() {
    override val id: Int = 415
    override val question: String = "Which best fits the description of corn in Pharaoh's dream"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Seven ears, one stalk, rank, good",
        41,
        listOf(5)
    )
    override val option2: String = "Seven branches, one stalk, rank, good"
    override val option3: String = "Seven ears, two stalks, rank, good"
    override val option4: String = "Seven branches, one stalk, rancid, good"
    override val options: List<String> = shuffledOptions
}
