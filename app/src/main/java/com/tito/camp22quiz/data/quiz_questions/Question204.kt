package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question204: Question() {
    override val id: Int = 501
    override val question: String = "Who did Joseph command to embalm his father?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His servants the physicians",
        50,
        listOf(2)
    )
    override val option2: String = "His brothers"
    override val option3: String = "Bilhah, the family nurse"
    override val option4: String = "His steward"
    override val options: List<String> = shuffledOptions
}
