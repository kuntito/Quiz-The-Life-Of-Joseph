package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question12: Question() {
    override val id: Int = 3712
    override val question: String = "What did Joseph's brothers do after he told them his first dream?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They hated him the more",
        37,
        listOf(5)
    )
    override val option2: String = "They laughed at him"
    override val option3: String = "They encouraged him"
    override val option4: String = "They felt he was joking"
    override val options: List<String> = shuffledOptions
}
