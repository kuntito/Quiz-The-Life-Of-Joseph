package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question231: Question() {
    override val id: Int = 499
    override val question: String = "On Jacob's death bed, he called Judah a ______________"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Lion's whelp",
        49,
        listOf(9)
    )
    override val option2: String = "Lion's guard"
    override val option3: String = "Lion's whip"
    override val option4: String = "Lion's den"
    override val options: List<String> = shuffledOptions
}
