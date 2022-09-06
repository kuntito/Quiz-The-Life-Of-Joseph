package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question233: Question() {
    override val id: Int = 4911
    override val question: String = "\"until Shiloh come; and unto him shall the gathering of the people be\", who did Jacob say this to?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Judah",
        49,
        listOf(8,9,10)
    )
    override val option2: String = "Simeon"
    override val option3: String = "Levi"
    override val option4: String = "Issachar"
    override val options: List<String> = shuffledOptions
}
