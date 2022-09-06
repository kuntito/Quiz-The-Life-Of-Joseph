package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question139: Question() {
    override val id: Int = 4311
    override val question: String = "Who brought out simeon unto Joseph's brothers?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The steward of the house",
        43,
        listOf(23)
    )
    override val option2: String = "Joseph"
    override val option3: String = "Potiphar"
    override val option4: String = "David"
    override val options: List<String> = shuffledOptions
}
