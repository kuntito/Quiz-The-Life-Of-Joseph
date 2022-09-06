package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question237: Question() {
    override val id: Int = 4915
    override val question: String = "Where did Jacob say Zebulun shall dwell?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "At the haven of the sea",
        49,
        listOf(13)
    )
    override val option2: String = "At the edge of the sea"
    override val option3: String = "At the hedge of the haven"
    override val option4: String = "At the border of the haven"
    override val options: List<String> = shuffledOptions
}
