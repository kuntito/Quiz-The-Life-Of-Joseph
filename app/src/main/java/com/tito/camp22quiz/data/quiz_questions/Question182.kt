package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question182: Question() {
    override val id: Int = 477
    override val question: String = "Joseph nourished his father and brethren with what?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Bread",
        47,
        listOf(12)
    )
    override val option2: String = "Grain"
    override val option3: String = "Rice"
    override val option4: String = "Agbado"
    override val options: List<String> = shuffledOptions
}
