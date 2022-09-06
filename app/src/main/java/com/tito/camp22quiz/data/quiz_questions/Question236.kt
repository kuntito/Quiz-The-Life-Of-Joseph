package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question236: Question() {
    override val id: Int = 4914
    override val question: String = "\"his eyes shall be red with wine, and his teeth white with milk\", who did Jacob say this to while on his death bed?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Judah",
        49,
        listOf(8,9,10,11,12)
    )
    override val option2: String = "Simeon"
    override val option3: String = "Judah"
    override val option4: String = "Issachar"
    override val options: List<String> = shuffledOptions
}
