package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question250: Question() {
    override val id: Int = 4928
    override val question: String = "\"the archers sorely grieved him, and shot at him and hated him\" Jacob said this about who in Gen 49?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Joseph",
        49,
        listOf(22,23)
    )
    override val option2: String = "Benjamin"
    override val option3: String = "Gad"
    override val option4: String = "Asher"
    override val options: List<String> = shuffledOptions
}
