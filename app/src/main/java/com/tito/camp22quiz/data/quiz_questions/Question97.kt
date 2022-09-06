package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question97: Question() {
    override val id: Int = 4115
    override val question: String = "What portion of the land did Joseph suggest to take up?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "One-fifth",
        41,
        listOf(34)
    )
    override val option2: String = "two-fifths"
    override val option3: String = "three-fifths"
    override val option4: String = "One-third"
    override val options: List<String> = shuffledOptions
}
