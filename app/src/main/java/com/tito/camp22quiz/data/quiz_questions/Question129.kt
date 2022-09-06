package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question129: Question() {
    override val id: Int = 431
    override val question: String = "Who brought up the need to bring their brother along when returning to Egypt?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Judah",
        43,
        listOf(1)
    )
    override val option2: String = "Flamini"
    override val option3: String = "Asher"
    override val option4: String = "Naphtali"
    override val options: List<String> = shuffledOptions
}
