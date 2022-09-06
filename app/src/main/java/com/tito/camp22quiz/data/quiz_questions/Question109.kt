package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question109: Question() {
    override val id: Int = 4127
    override val question: String = "How many countries came to Joseph to buy corn?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "All countries",
        41,
        listOf(57)
    )
    override val option2: String = "Canaan and Midian"
    override val option3: String = "Gilead, Atad and Afghan"
    override val option4: String = "Bethlehem"
    override val options: List<String> = shuffledOptions
}
