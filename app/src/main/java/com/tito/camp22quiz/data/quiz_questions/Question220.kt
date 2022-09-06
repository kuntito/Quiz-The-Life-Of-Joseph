package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question220: Question() {
    override val id: Int = 376
    override val question: String = "Where was the pit Reuben suggested Joseph be casted into?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The wilderness",
        37,
        listOf(22)
    )
    override val option2: String = "The wild"
    override val option3: String = "The ravin"
    override val option4: String = "The Valley"
    override val options: List<String> = shuffledOptions
}
