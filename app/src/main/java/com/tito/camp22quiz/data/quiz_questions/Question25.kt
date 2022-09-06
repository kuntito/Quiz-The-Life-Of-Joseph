package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question25: Question() {
    override val id: Int = 3725
    override val question: String = "What did Joseph's brothers say when they saw him afar off?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "\"behold, this dreamer cometh\"",
        37,
        listOf(19)
    )
    override val option2: String = "\"behold, our father's favourite cometh\""
    override val option3: String = "\"behold, our leader cometh\""
    override val option4: String = "\"behold, the coat cometh\""
    override val options: List<String> = shuffledOptions
}
