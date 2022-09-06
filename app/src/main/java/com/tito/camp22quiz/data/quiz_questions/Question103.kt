package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question103: Question() {
    override val id: Int = 4121
    override val question: String = "Who is the father of Joseph's wife?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The priest of On",
        41,
        listOf(45)
    )
    override val option2: String = "The leader of Gilead"
    override val option3: String = "One of egypt's guards"
    override val option4: String = "Potiphar's cousin"
    override val options: List<String> = shuffledOptions
}
