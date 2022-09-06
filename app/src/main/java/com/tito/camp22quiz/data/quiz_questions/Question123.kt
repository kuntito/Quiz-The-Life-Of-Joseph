package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question123: Question() {
    override val id: Int = 4214
    override val question: String = "In what manner did Joseph speak to his brethen the first time they came to buy food in Egypt?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He spoke to them roughly",
        42,
        listOf(30)
    )
    override val option2: String = "He spoke to them kindly"
    override val option3: String = "He spoke to them strongly"
    override val option4: String = "He spoke to them peacefully"
    override val options: List<String> = shuffledOptions
}
