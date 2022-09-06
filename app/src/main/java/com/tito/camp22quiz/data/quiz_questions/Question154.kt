package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question154: Question() {
    override val id: Int = 449
    override val question: String = "And we said unto my lord, The lad cannot leave his father: for if he should leave his father _____"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His father would die",
        44,
        listOf(22)
    )
    override val option2: String = "His father would be greaved"
    override val option3: String = "His father would be sad"
    override val option4: String = "His father would mourn"
    override val options: List<String> = shuffledOptions
}
