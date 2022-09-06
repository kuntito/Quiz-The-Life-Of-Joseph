package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question121: Question() {
    override val id: Int = 4212
    override val question: String = "Why did Joseph's brothers not know that he understood them?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He spoke through an interpreter",
        42,
        listOf(23)
    )
    override val option2: String = "His appearance had changed"
    override val option3: String = "He pretended to be deaf"
    override val option4: String = "They were scared in his presence"
    override val options: List<String> = shuffledOptions
}
