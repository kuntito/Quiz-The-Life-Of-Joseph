package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question176: Question() {
    override val id: Int = 471
    override val question: String = "Joseph presented how many brothers to Pharaoh?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Five",
        47,
        listOf(3)
    )
    override val option2: String = "Six"
    override val option3: String = "Four"
    override val option4: String = "Three"
    override val options: List<String> = shuffledOptions
}
