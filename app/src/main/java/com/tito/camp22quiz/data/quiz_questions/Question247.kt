package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question247: Question() {
    override val id: Int = 4925
    override val question: String = "Who shall yield royal dainties according to Jacob in Gen 49?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Asher",
        49,
        listOf(20)
    )
    override val option2: String = "Gad"
    override val option3: String = "Reuben"
    override val option4: String = "Israel"
    override val options: List<String> = shuffledOptions
}
