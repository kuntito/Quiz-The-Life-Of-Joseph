package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question130: Question() {
    override val id: Int = 432
    override val question: String = "Who told Joseph he'd be surety for the youngest brother?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Judah",
        43,
        listOf(8,9)
    )
    override val option2: String = "Levi"
    override val option3: String = "Simeon"
    override val option4: String = "Reuben"
    override val options: List<String> = shuffledOptions
}
