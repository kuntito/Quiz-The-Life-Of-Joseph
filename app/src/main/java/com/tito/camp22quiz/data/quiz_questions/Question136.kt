package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question136: Question() {
    override val id: Int = 438
    override val question: String = "What time did Joseph intend to dine with his brothers?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Noon",
        43,
        listOf(16)
    )
    override val option2: String = "Before noon"
    override val option3: String = "After noon"
    override val option4: String = "Evening"
    override val options: List<String> = shuffledOptions
}
