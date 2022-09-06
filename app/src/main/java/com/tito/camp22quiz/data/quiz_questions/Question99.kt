package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question99: Question() {
    override val id: Int = 4117
    override val question: String = "What was the third thing Pharaoh gave Joseph after appointing him?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "A gold chain",
        41,
        listOf(42)
    )
    override val option2: String = "A ring"
    override val option3: String = "A signet"
    override val option4: String = "A staff"
    override val options: List<String> = shuffledOptions
}
