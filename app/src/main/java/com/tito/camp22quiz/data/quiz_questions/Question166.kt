package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question166: Question() {
    override val id: Int = 4512
    override val question: String = "How many asses did Joseph send unto his father?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Twenty",
        45,
        listOf(23)
    )
    override val option2: String = "Ten"
    override val option3: String = "Eighteen"
    override val option4: String = "Seventeen"
    override val options: List<String> = shuffledOptions
}
