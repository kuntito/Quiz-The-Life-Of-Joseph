package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question62: Question() {
    override val id: Int = 3914
    override val question: String = "What was Potiphar's immediate reaction to his wife's words?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His wrath was kindled",
        39,
        listOf(19)
    )
    override val option2: String = "He was dumbfounded"
    override val option3: String = "He didn’t want to believe it"
    override val option4: String = "He didn't believe it"
    override val options: List<String> = shuffledOptions
}
