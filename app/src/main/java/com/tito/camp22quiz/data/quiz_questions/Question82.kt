package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question82: Question() {
    override val id: Int = 4018
    override val question: String = "When was Pharoah's birthday?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Three days after the joseph's interpretation in the prison",
        40,
        listOf(20)
    )
    override val option2: String = "May 27"
    override val option3: String = "The day Joseph's brethren came to Egypt"
    override val option4: String = "The day Joseph bought all the cattle in Egypt"
    override val options: List<String> = shuffledOptions
}
