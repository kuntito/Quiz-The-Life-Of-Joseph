package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question184: Question() {
    override val id: Int = 479
    override val question: String = "What did Joseph collect after the egyptians ran out of money?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Cattle",
        47,
        listOf(15,16)
    )
    override val option2: String = "Their children"
    override val option3: String = "Service"
    override val option4: String = "Curses"
    override val options: List<String> = shuffledOptions
}
