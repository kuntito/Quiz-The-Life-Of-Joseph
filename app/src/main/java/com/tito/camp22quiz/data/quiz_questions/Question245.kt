package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question245: Question() {
    override val id: Int = 4923
    override val question: String = "Who did Jacob say a troop will overcome but will overcome at the last?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Gad",
        49,
        listOf(19)
    )
    override val option2: String = "Levi"
    override val option3: String = "Chris Brown"
    override val option4: String = "Reuben"
    override val options: List<String> = shuffledOptions
}
