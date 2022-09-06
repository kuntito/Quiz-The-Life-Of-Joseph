package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question214: Question() {
    override val id: Int = 5011
    override val question: String = "What's the name of Manasseh's son"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Machir",
        50,
        listOf(23)
    )
    override val option2: String = "Machisio"
    override val option3: String = "Matches"
    override val option4: String = "Omarion"
    override val options: List<String> = shuffledOptions
}
