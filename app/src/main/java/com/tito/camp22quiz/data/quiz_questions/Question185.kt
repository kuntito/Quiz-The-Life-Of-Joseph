package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question185: Question() {
    override val id: Int = 4710
    override val question: String = "How long did the egyptians give Joseph cattle in exchange for food?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "1 year",
        47,
        listOf(17,18)
    )
    override val option2: String = "For like 2 haars"
    override val option3: String = "2 years"
    override val option4: String = "3 years"
    override val options: List<String> = shuffledOptions
}
