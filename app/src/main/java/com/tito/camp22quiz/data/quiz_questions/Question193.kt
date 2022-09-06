package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question193: Question() {
    override val id: Int = 483
    override val question: String = "Just like Reuben and Simeon, Jacob said to Joseph \"Ephraim and Manasseh are ______\""
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Mine",
        48,
        listOf(5)
    )
    override val option2: String = "Yours"
    override val option3: String = "for the LORD"
    override val option4: String = "special"
    override val options: List<String> = shuffledOptions
}
