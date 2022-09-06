package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question104: Question() {
    override val id: Int = 4122
    override val question: String = "How old was Joseph when he stood before Pharaoh in Egypt?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "30 years",
        41,
        listOf(46)
    )
    override val option2: String = "17 years"
    override val option3: String = "25 years"
    override val option4: String = "35 years"
    override val options: List<String> = shuffledOptions
}
