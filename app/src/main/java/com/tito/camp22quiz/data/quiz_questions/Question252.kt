package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question252: Question() {
    override val id: Int = 4930
    override val question: String = "From where is the shepherd, the stone of Israel?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The arms of Joseph's hands",
        49,
        listOf(22,23,24)
    )
    override val option2: String = "The arms of Benjamin's hands"
    override val option3: String = "The arms of the LORD"
    override val option4: String = "The coat of arms"
    override val options: List<String> = shuffledOptions
}
