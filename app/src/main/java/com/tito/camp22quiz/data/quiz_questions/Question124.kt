package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question124: Question() {
    override val id: Int = 4215
    override val question: String = "What was the reaction of Joseph's brothers after realizing their money was in their sack?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They were afraid",
        42,
        listOf(35)
    )
    override val option2: String = "They were happy"
    override val option3: String = "They were confused"
    override val option4: String = "They were satisfied"
    override val options: List<String> = shuffledOptions
}
