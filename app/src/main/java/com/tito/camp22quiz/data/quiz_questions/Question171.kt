package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question171: Question() {
    override val id: Int = 462
    override val question: String = "What did God tell Jacob at Beersheba?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Fear not to go down into Egypt",
        46,
        listOf(3)
    )
    override val option2: String = "Peace be unto you"
    override val option3: String = "Please, forgive your children"
    override val option4: String = "I am the LORD"
    override val options: List<String> = shuffledOptions
}
