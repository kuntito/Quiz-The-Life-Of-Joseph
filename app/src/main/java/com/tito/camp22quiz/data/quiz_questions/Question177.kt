package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question177: Question() {
    override val id: Int = 472
    override val question: String = "Who did Pharaoh make rulers of his cattle?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Men of activity among Joseph's brothers",
        47,
        listOf(6)
    )
    override val option2: String = "Men of valor among Joseph's brothers"
    override val option3: String = "The  strongest men among Joseph's brothers"
    override val option4: String = "The wise and discreet among Joseph's brothers"
    override val options: List<String> = shuffledOptions
}
