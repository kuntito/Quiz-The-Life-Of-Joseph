package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question50: Question() {
    override val id: Int = 392
    override val question: String = "Why was Joseph prosperous in potiphar's house?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The LORD was with him",
        39,
        listOf(2)
    )
    override val option2: String = "It was his destiny"
    override val option3: String = "Potiphar had a liking for him"
    override val option4: String = "He interpreted Potiphar's dream"
    override val options: List<String> = shuffledOptions
}
