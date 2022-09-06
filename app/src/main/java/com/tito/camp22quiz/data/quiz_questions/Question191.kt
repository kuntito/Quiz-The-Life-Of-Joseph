package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question191: Question() {
    override val id: Int = 481
    override val question: String = "Who did Joseph take along when he he went to see his sick father?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Manasseh and Ephraim",
        48,
        listOf(1)
    )
    override val option2: String = "Reuben and Levi"
    override val option3: String = "Levi and Moses"
    override val option4: String = "Simeon and Judah"
    override val options: List<String> = shuffledOptions
}
