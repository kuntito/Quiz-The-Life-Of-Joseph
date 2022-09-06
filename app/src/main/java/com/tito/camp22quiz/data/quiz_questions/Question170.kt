package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question170: Question() {
    override val id: Int = 461
    override val question: String = "Where did Israel go to offer sacrifices?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Beersheba",
        46,
        listOf(1)
    )
    override val option2: String = "Timnath"
    override val option3: String = "Padan"
    override val option4: String = "Hirachio"
    override val options: List<String> = shuffledOptions
}
