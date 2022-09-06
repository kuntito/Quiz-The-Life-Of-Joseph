package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question76: Question() {
    override val id: Int = 4012
    override val question: String = "From where did Joseph say he was stolen?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The land of the Hebrews",
        40,
        listOf(15)
    )
    override val option2: String = "The land of Canaan"
    override val option3: String = "The land of Bethlehem"
    override val option4: String = "The land of the Israelites"
    override val options: List<String> = shuffledOptions
}
