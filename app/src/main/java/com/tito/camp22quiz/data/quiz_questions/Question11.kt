package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question11: Question() {
    override val id: Int = 3711
    override val question: String = "What couldn't Joseph's brothers do because they hated him?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They couldn't speak peaceably to him",
        37,
        listOf(4)
    )
    override val option2: String = "They couldn’t eat with him"
    override val option3: String = "They couldn't speak around him"
    override val option4: String = "They couldn't work with him"
    override val options: List<String> = shuffledOptions
}
