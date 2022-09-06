package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question190: Question() {
    override val id: Int = 4715
    override val question: String = "How old was Jacob when he died?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "147 years",
        47,
        listOf(28)
    )
    override val option2: String = "150 years"
    override val option3: String = "148 years"
    override val option4: String = "149 years"
    override val options: List<String> = shuffledOptions
}
