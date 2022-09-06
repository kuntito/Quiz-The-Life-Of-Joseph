package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question224: Question() {
    override val id: Int = 492
    override val question: String = "Who did he call he beginning of his strength, the excellency of dignity and the excellency of power"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Reuben",
        49,
        listOf(3)
    )
    override val option2: String = "Simeon"
    override val option3: String = "Gad"
    override val option4: String = "Asher"
    override val options: List<String> = shuffledOptions
}
