package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question34: Question() {
    override val id: Int = 3734
    override val question: String = "The people who bought Joseph were bearing what?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Spicery, Balm and myrrh",
        37,
        listOf(25)
    )
    override val option2: String = "Oil, nuts and almonds"
    override val option3: String = "Honey, balm and myrrh"
    override val option4: String = "Spicery, fruits, vessels"
    override val options: List<String> = shuffledOptions
}
