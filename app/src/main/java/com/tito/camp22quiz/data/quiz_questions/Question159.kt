package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question159: Question() {
    override val id: Int = 455
    override val question: String = "Where did Joseph say his father will dwell in?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Goshen",
        45,
        listOf(10)
    )
    override val option2: String = "Imraim"
    override val option3: String = "Atad"
    override val option4: String = "Dothan"
    override val options: List<String> = shuffledOptions
}
