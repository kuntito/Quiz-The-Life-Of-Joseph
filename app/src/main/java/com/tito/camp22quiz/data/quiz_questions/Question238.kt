package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question238: Question() {
    override val id: Int = 4916
    override val question: String = "Who shall be for an haven of ships according to Jacob in Gen 49?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Zebulun",
        49,
        listOf(13)
    )
    override val option2: String = "Issachar"
    override val option3: String = "Benjamin"
    override val option4: String = "Reuben"
    override val options: List<String> = shuffledOptions
}
