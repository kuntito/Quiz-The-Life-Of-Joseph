package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question194: Question() {
    override val id: Int = 484
    override val question: String = "Where did Joseph's mother die?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Canaan",
        48,
        listOf(7)
    )
    override val option2: String = "Luz"
    override val option3: String = "Padan"
    override val option4: String = "Kilimanjaro"
    override val options: List<String> = shuffledOptions
}
