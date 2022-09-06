package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question251: Question() {
    override val id: Int = 4929
    override val question: String = "\"but his bow abode in strentth, and the arms of his hands were made strong by _______________, Jacob said this about who in Gen 49?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The hands of the mighty God, Joseph",
        49,
        listOf(22,23,24)
    )
    override val option2: String = "The hands of the LORD, Benjamin"
    override val option3: String = "The hands of Jacob, Joseph"
    override val option4: String = "The hands of The holy spirit, Benjamin"
    override val options: List<String> = shuffledOptions
}
