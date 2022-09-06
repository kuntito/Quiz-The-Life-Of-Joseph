package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question37: Question() {
    override val id: Int = 3737
    override val question: String = "Who rent his clothes when he didn't find Joseph?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Reuben",
        37,
        listOf(29)
    )
    override val option2: String = "Judah"
    override val option3: String = "Benjamin"
    override val option4: String = "Jacob"
    override val options: List<String> = shuffledOptions
}
