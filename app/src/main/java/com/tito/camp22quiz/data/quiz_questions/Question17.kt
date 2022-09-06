package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question17: Question() {
    override val id: Int = 3717
    override val question: String = "What did Jacob's brothers do after hearing the second dream?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They envied him",
        37,
        listOf(11)
    )
    override val option2: String = "They hated him yet the more"
    override val option3: String = "They despised him"
    override val option4: String = "They laughed at him again"
    override val options: List<String> = shuffledOptions
}
