package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question102: Question() {
    override val id: Int = 4120
    override val question: String = "What is the name of the father of Joseph's wife?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Potipherah",
        41,
        listOf(45)
    )
    override val option2: String = "Potiphar"
    override val option3: String = "Pharaoh"
    override val option4: String = "Sheila"
    override val options: List<String> = shuffledOptions
}
