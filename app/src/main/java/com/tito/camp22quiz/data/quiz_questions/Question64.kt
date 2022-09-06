package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question64: Question() {
    override val id: Int = 3916
    override val question: String = "Why was Joseph prosperous in the prison?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The LORD was with him",
        39,
        listOf(23)
    )
    override val option2: String = "The prison keeper liked him"
    override val option3: String = "The prisoners liked him"
    override val option4: String = "He interpreted the prisoners dreams"
    override val options: List<String> = shuffledOptions
}
