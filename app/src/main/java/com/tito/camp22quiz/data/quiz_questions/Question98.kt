package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question98: Question() {
    override val id: Int = 4116
    override val question: String = "What was the first thing Pharaoh gave Joseph after appointing him?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His ring",
        41,
        listOf(42)
    )
    override val option2: String = "His signet"
    override val option3: String = "His crown"
    override val option4: String = "His Staff"
    override val options: List<String> = shuffledOptions
}
