package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question161: Question() {
    override val id: Int = 457
    override val question: String = "How many of Joseph's brethren did he kiss and weep on?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "All his brethren",
        45,
        listOf(15)
    )
    override val option2: String = "One, Benjamin"
    override val option3: String = "One, Judah"
    override val option4: String = "Benjamin and Judah"
    override val options: List<String> = shuffledOptions
}
