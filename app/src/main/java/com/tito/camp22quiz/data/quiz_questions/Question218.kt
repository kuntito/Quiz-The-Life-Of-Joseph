package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question218: Question() {
    override val id: Int = 374
    override val question: String = "What did Jacob say after hearing Joseph's first dream?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "It wasn't recorded",
        37,
        listOf(5,6,7,8)
    )
    override val option2: String = "He said 'God be with thee my son'"
    override val option3: String = "He observed the saying"
    override val option4: String = "He spoke calmly to him"
    override val options: List<String> = shuffledOptions
}
