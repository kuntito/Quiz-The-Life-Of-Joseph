package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question162: Question() {
    override val id: Int = 458
    override val question: String = "How was Pharaoh's reaction when he heard that Joseph's brethren had come?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He was pleased",
        45,
        listOf(16)
    )
    override val option2: String = "He was troubled"
    override val option3: String = "He was confused"
    override val option4: String = "He was terrified"
    override val options: List<String> = shuffledOptions
}
