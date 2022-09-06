package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question40: Question() {
    override val id: Int = 3740
    override val question: String = "How many days did Jacob mourn Joseph?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Many days",
        37,
        listOf(34)
    )
    override val option2: String = "Seven days"
    override val option3: String = "Threescore and ten days"
    override val option4: String = "Fourteen days"
    override val options: List<String> = shuffledOptions
}
