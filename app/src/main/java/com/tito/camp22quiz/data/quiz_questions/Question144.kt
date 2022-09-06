package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question144: Question() {
    override val id: Int = 4316
    override val question: String = "How large was Benjamin's mess compared to his brothers"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Five times",
        43,
        listOf(34)
    )
    override val option2: String = "Four times"
    override val option3: String = "Three times"
    override val option4: String = "Seven times"
    override val options: List<String> = shuffledOptions
}
