package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question5: Question() {
    override val id: Int = 375
    override val question: String = "Who are Bilhah and Zilpah?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Jacob's wives",
        37,
        listOf(2)
    )
    override val option2: String = "Joseph's concubines"
    override val option3: String = "Judah's ex-girlfriends"
    override val option4: String = "Jacob's workers"
    override val options: List<String> = shuffledOptions
}
