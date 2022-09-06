package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question148: Question() {
    override val id: Int = 443
    override val question: String = "When did Joseph's brothers leave Egypt on their second Journey"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "As soon as the morning was light",
        44,
        listOf(3)
    )
    override val option2: String = "first thing in the evening"
    override val option3: String = "After dining with Joseph"
    override val option4: String = "After their brother was released"
    override val options: List<String> = shuffledOptions
}
