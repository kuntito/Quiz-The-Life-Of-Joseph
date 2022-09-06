package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question36: Question() {
    override val id: Int = 3736
    override val question: String = "How much was Joseph sold for?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "20 pieces of silver",
        37,
        listOf(28)
    )
    override val option2: String = "30 pieces of silver"
    override val option3: String = "15 shekels of silver"
    override val option4: String = "30 shekels of silver"
    override val options: List<String> = shuffledOptions
}
