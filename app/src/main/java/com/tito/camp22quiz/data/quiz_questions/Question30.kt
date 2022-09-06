package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question30: Question() {
    override val id: Int = 3730
    override val question: String = "What was inside the pit Joseph was thrown into?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "It was empty",
        37,
        listOf(24)
    )
    override val option2: String = "Snakes"
    override val option3: String = "Corn"
    override val option4: String = "Beads"
    override val options: List<String> = shuffledOptions
}
