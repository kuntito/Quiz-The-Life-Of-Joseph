package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question113: Question() {
    override val id: Int = 424
    override val question: String = "The first time Joesph's brothers came to egypt, who wasn't among them?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Benjamin",
        42,
        listOf(4)
    )
    override val option2: String = "Judah"
    override val option3: String = "Gad"
    override val option4: String = "Reuben"
    override val options: List<String> = shuffledOptions
}
