package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question105: Question() {
    override val id: Int = 4123
    override val question: String = "When were Joseph's children born?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Before the famine",
        41,
        listOf(50)
    )
    override val option2: String = "During the famine"
    override val option3: String = "After the famine"
    override val option4: String = "The second year of the famine"
    override val options: List<String> = shuffledOptions
}
