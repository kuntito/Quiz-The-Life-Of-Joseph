package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question2: Question() {
    override val id: Int = 372
    override val question: String = "What land did Jacob dwell in?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Canaan",
        37,
        listOf(1)
    )
    override val option2: String = "Peruz"
    override val option3: String = "Bethlehem"
    override val option4: String = "Chezib"
    override val options: List<String> = shuffledOptions
}
