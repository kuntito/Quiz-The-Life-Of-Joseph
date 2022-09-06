package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question14: Question() {
    override val id: Int = 3714
    override val question: String = "What did Joseph's brothers sheaves do to Joseph's sheaf"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They made obeisance to it",
        37,
        listOf(7)
    )
    override val option2: String = "They ate it"
    override val option3: String = "They respected it"
    override val option4: String = "They made it dry up"
    override val options: List<String> = shuffledOptions
}
