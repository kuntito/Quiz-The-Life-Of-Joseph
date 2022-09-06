package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question195: Question() {
    override val id: Int = 485
    override val question: String = "Where was Jacob coming from before Rachel died?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Padan",
        48,
        listOf(7)
    )
    override val option2: String = "Luz"
    override val option3: String = "One place"
    override val option4: String = "Viewing center"
    override val options: List<String> = shuffledOptions
}
