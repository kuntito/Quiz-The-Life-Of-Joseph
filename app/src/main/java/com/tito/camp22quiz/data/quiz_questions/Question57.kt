package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question57: Question() {
    override val id: Int = 399
    override val question: String = "How often did potiphar's wife speak to Joseph?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Day by day",
        39,
        listOf(10)
    )
    override val option2: String = "Once in a week"
    override val option3: String = "Whenever he came into the house"
    override val option4: String = "Twice a day"
    override val options: List<String> = shuffledOptions
}
