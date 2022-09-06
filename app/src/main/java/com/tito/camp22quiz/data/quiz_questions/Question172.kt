package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question172: Question() {
    override val id: Int = 463
    override val question: String = "Who came with Jacob to Egypt?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "All his seed",
        46,
        listOf(6)
    )
    override val option2: String = "His wives"
    override val option3: String = "Joseph's childhood friends"
    override val option4: String = "The entire neighbourhood of canaan"
    override val options: List<String> = shuffledOptions
}
