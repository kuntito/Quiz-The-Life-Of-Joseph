package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question200: Question() {
    override val id: Int = 491
    override val question: String = "Why did Jacob curse Reuben?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He defiled his father's bed",
        49,
        listOf(3,4)
    )
    override val option2: String = "He spoke against the leaders of canaan"
    override val option3: String = "He didn't protect Joseph"
    override val option4: String = "He didn't fight for his rights"
    override val options: List<String> = shuffledOptions
}
