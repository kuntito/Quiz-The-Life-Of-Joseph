package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question65: Question() {
    override val id: Int = 401
    override val question: String = "Why did Pharaoh imprison the chief baker?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He offended him",
        40,
        listOf(1)
    )
    override val option2: String = "He served him spoilt bread"
    override val option3: String = "He was lazy"
    override val option4: String = "He ate Pharaoh's bread"
    override val options: List<String> = shuffledOptions
}
