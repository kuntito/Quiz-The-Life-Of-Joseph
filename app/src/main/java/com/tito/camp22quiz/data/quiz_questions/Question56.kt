package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question56: Question() {
    override val id: Int = 398
    override val question: String = "In response to Potiphar's wife, Joseph said \"How then can I do this great wickedness, and sin against ...?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "God",
        39,
        listOf(9)
    )
    override val option2: String = "My master"
    override val option3: String = "Potiphar"
    override val option4: String = "Pharaoh"
    override val options: List<String> = shuffledOptions
}
