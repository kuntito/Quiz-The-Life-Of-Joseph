package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question41: Question() {
    override val id: Int = 3741
    override val question: String = "Who rose up to comfort Jacob?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "All his sons and daughters",
        37,
        listOf(35)
    )
    override val option2: String = "All his sons"
    override val option3: String = "All his sons and daughter"
    override val option4: String = "His daughter"
    override val options: List<String> = shuffledOptions
}
