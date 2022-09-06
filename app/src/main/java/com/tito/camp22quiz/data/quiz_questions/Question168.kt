package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question168: Question() {
    override val id: Int = 4514
    override val question: String = "What was Jacob's reaction when his children told him Joseph was alive?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His heart fainted, for he believed them not",
        45,
        listOf(26)
    )
    override val option2: String = "He cried tears of joy"
    override val option3: String = "He jubilated loudly"
    override val option4: String = "He thanked God"
    override val options: List<String> = shuffledOptions
}
