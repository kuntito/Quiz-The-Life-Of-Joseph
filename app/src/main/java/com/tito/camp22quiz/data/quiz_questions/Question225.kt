package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question225: Question() {
    override val id: Int = 493
    override val question: String = "On Jacob's death bed, who did he say would be unstable as water?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Reuben",
        49,
        listOf(3)
    )
    override val option2: String = "Zebulun"
    override val option3: String = "Issachar"
    override val option4: String = "Manasseh"
    override val options: List<String> = shuffledOptions
}
