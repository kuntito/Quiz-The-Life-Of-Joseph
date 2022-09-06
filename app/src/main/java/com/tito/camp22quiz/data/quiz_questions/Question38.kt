package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question38: Question() {
    override val id: Int = 3738
    override val question: String = "\"the child is not; and I, whither shall I go?\", who said that?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Reuben",
        37,
        listOf(30)
    )
    override val option2: String = "Judah"
    override val option3: String = "Jacob"
    override val option4: String = "Benjamin"
    override val options: List<String> = shuffledOptions
}
