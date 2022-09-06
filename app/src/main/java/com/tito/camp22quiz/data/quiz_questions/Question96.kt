package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question96: Question() {
    override val id: Int = 4114
    override val question: String = "How did Joseph describe the man Pharaoh was to find?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Discreet and wise",
        41,
        listOf(33)
    )
    override val option2: String = "Honest and just"
    override val option3: String = "Disciplined and steadfast"
    override val option4: String = "Responsible and ingenious"
    override val options: List<String> = shuffledOptions
}
