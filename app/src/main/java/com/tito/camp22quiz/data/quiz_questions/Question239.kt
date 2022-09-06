package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question239: Question() {
    override val id: Int = 4917
    override val question: String = "Whose border shall be unto Zido according to Jacob in Gen 49?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Zebulun",
        49,
        listOf(13)
    )
    override val option2: String = "Issachar"
    override val option3: String = "Asher"
    override val option4: String = "Gad"
    override val options: List<String> = shuffledOptions
}
