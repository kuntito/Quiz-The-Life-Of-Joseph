package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question134: Question() {
    override val id: Int = 436
    override val question: String = "How much did Joseph's brothers take back to Egypt?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Double their money and the money brought in their sacks",
        43,
        listOf(12)
    )
    override val option2: String = "Double their money"
    override val option3: String = "100 shekels of silver"
    override val option4: String = "200 shekels of silver"
    override val options: List<String> = shuffledOptions
}
