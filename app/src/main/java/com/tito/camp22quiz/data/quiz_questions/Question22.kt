package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question22: Question() {
    override val id: Int = 3722
    override val question: String = "Where were Jacob's brothers actually feeding the flock"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Dothan",
        37,
        listOf(17)
    )
    override val option2: String = "Shechem"
    override val option3: String = "Padan"
    override val option4: String = "Abelmizraim"
    override val options: List<String> = shuffledOptions
}
