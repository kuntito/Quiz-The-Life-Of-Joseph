package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question116: Question() {
    override val id: Int = 427
    override val question: String = "What did Joseph call his brothers on their arrival to Egypt"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Spies",
        42,
        listOf(9)
    )
    override val option2: String = "Hebrew"
    override val option3: String = "Shepherds"
    override val option4: String = "Brethren"
    override val options: List<String> = shuffledOptions
}
