package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question243: Question() {
    override val id: Int = 4921
    override val question: String = "Who bowed his shoulder to bear, and became a servant unto tribute according to Jacob in Gen 49?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Issachar",
        49,
        listOf(14,15)
    )
    override val option2: String = "Reuben"
    override val option3: String = "Gad"
    override val option4: String = "Zebulun"
    override val options: List<String> = shuffledOptions
}
