package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question163: Question() {
    override val id: Int = 459
    override val question: String = "Who gave wagons to Joseph's brothers?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Joseph",
        45,
        listOf(21)
    )
    override val option2: String = "Pharaoh"
    override val option3: String = "Isaac"
    override val option4: String = "Joseph's stewards"
    override val options: List<String> = shuffledOptions
}
