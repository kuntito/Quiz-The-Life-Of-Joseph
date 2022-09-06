package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question211: Question() {
    override val id: Int = 508
    override val question: String = "The place where Joseph mourned his father was named ________ by the inhabitants of the land, the Canaanites"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Abelmizraim",
        50,
        listOf(11)
    )
    override val option2: String = "Abelmizran"
    override val option3: String = "Abelmizan"
    override val option4: String = "Abelmiz"
    override val options: List<String> = shuffledOptions
}
