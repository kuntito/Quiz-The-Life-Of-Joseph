package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question6: Question() {
    override val id: Int = 376
    override val question: String = "In Gen 37, Jacob received evil reports of his sons from whom?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Joseph",
        37,
        listOf(2)
    )
    override val option2: String = "Gad"
    override val option3: String = "Asher"
    override val option4: String = "his servants"
    override val options: List<String> = shuffledOptions
}
