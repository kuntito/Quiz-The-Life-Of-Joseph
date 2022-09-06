package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question55: Question() {
    override val id: Int = 397
    override val question: String = "Potiphar placed every thing he had in Joseph's hands except "
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His wife",
        39,
        listOf(9)
    )
    override val option2: String = "His servants"
    override val option3: String = "His children"
    override val option4: String = "His child"
    override val options: List<String> = shuffledOptions
}
