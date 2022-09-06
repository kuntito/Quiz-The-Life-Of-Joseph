package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question3: Question() {
    override val id: Int = 373
    override val question: String = "How old was Joseph when he was feeding the flock?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "17",
        37,
        listOf(2)
    )
    override val option2: String = "18"
    override val option3: String = "16"
    override val option4: String = "15"
    override val options: List<String> = shuffledOptions
}
