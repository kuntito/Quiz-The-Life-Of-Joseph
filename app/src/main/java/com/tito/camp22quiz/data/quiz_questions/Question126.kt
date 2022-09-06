package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question126: Question() {
    override val id: Int = 4217
    override val question: String = "What did reuben ask Jacob to do if he didn't bring his brothers back?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He asked him to slay his two sons",
        42,
        listOf(37)
    )
    override val option2: String = "He asked him to slay his family"
    override val option3: String = "He asked him to slay his two sons and daughters"
    override val option4: String = "He asked him to slay his family"
    override val options: List<String> = shuffledOptions
}
