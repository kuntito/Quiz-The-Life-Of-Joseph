package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question128: Question() {
    override val id: Int = 4219
    override val question: String = "What did Joseph say to Benjamin when he got to the house?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "God be gracious unto thee, my son",
        42,
        listOf(29)
    )
    override val option2: String = "I have sorely missed you"
    override val option3: String = "Blessed be God for uniting us again"
    override val option4: String = "I am deeply pleased"
    override val options: List<String> = shuffledOptions
}
