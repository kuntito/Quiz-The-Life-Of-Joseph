package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question79: Question() {
    override val id: Int = 4015
    override val question: String = "In the baker's dream, What were the contents of the basket?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Bakemeats",
        40,
        listOf(17)
    )
    override val option2: String = "Bread"
    override val option3: String = "Baked goods"
    override val option4: String = "Bakery"
    override val options: List<String> = shuffledOptions
}
