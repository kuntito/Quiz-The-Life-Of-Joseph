package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question26: Question() {
    override val id: Int = 3726
    override val question: String = "Who suggested they slay Joseph and cast him into a pit?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "It was unstated",
        37,
        listOf(20)
    )
    override val option2: String = "Levi"
    override val option3: String = "Zebulun"
    override val option4: String = "Naphthali"
    override val options: List<String> = shuffledOptions
}
