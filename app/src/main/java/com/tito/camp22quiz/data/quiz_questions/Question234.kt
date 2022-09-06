package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question234: Question() {
    override val id: Int = 4912
    override val question: String = "\"binding his foal unto the vine\" who did Jacob say this to while on his death bed?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Judah",
        49,
        listOf(8,9,10,11)
    )
    override val option2: String = "Zebulun"
    override val option3: String = "Naphthali"
    override val option4: String = "Benjamin"
    override val options: List<String> = shuffledOptions
}
