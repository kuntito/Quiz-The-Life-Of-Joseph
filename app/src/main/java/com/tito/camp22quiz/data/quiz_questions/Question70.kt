package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question70: Question() {
    override val id: Int = 406
    override val question: String = "Why were the chief butler and chief baker sad?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They had a dream for which there was no interpreter",
        40,
        listOf(7,8)
    )
    override val option2: String = "They had a bad dream"
    override val option3: String = "The prison keeper despised them"
    override val option4: String = "They just felt like that"
    override val options: List<String> = shuffledOptions
}
