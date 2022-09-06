package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question199: Question() {
    override val id: Int = 489
    override val question: String = "Jacob gave Joseph _____ portion above his brethren"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "One",
        48,
        listOf(22)
    )
    override val option2: String = "Two"
    override val option3: String = "Three"
    override val option4: String = "Four"
    override val options: List<String> = shuffledOptions
}
