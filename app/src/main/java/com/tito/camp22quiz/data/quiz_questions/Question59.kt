package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question59: Question() {
    override val id: Int = 3911
    override val question: String = "Who did potiphar's wife call right after Joseph fled from her?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "She called the men of her house",
        39,
        listOf(13,14)
    )
    override val option2: String = "She called Potiphar"
    override val option3: String = "She called Pharaoh"
    override val option4: String = "She called her sister, Potipheram"
    override val options: List<String> = shuffledOptions
}
