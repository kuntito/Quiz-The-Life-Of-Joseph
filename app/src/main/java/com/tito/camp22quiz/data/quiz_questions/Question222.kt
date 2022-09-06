package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question222: Question() {
    override val id: Int = 391
    override val question: String = "Why did the LORD bless Potiphar's house?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "For Joseph's sake",
        39,
        listOf(5)
    )
    override val option2: String = "Potiphar was an upright man"
    override val option3: String = "Potiphar had reliable workers"
    override val option4: String = "Joseph was a man of faith"
    override val options: List<String> = shuffledOptions
}
