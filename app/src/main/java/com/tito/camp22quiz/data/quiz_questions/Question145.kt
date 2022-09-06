package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question145: Question() {
    override val id: Int = 4317
    override val question: String = "When Joseph came into the house, whose welfare did he ask of?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His brothers",
        43,
        listOf(27)
    )
    override val option2: String = "His father"
    override val option3: String = "His mother"
    override val option4: String = "His children"
    override val options: List<String> = shuffledOptions
}
