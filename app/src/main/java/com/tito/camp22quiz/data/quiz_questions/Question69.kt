package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question69: Question() {
    override val id: Int = 405
    override val question: String = "How long were the butler and baker in ward before having the dream?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "A season",
        40,
        listOf(4)
    )
    override val option2: String = "Fourteen days"
    override val option3: String = "Eighty days"
    override val option4: String = "threescore and ten days"
    override val options: List<String> = shuffledOptions
}
