package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question60: Question() {
    override val id: Int = 3912
    override val question: String = "Where did potiphar's wife place Joseph's garment when awaiting Potiphar"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "She placed it by her",
        39,
        listOf(16)
    )
    override val option2: String = "She wrapped it around her"
    override val option3: String = "She placed it on Potiphar's chair"
    override val option4: String = "She placed it at the entrance to her room"
    override val options: List<String> = shuffledOptions
}
