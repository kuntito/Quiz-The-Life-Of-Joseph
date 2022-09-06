package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question249: Question() {
    override val id: Int = 4927
    override val question: String = "Joseph is a fruitful bough by a well, whose branches _____________________"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Run over the wall",
        49,
        listOf(22)
    )
    override val option2: String = "Run over the hill"
    override val option3: String = "Fall over the wall"
    override val option4: String = "Fall over the hill"
    override val options: List<String> = shuffledOptions
}
