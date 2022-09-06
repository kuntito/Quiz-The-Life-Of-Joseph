package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question20: Question() {
    override val id: Int = 3720
    override val question: String = "From where did Jacob send Joseph to check up on his brothers?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The vale of hebron",
        37,
        listOf(14)
    )
    override val option2: String = "The hem of hebron"
    override val option3: String = "The gate of hebron"
    override val option4: String = "Hebron"
    override val options: List<String> = shuffledOptions
}
