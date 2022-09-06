package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question207: Question() {
    override val id: Int = 504
    override val question: String = "Who wasn't explicitly mentioned among the people who followed Joseph to bury his father?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His wife",
        50,
        listOf(7,8)
    )
    override val option2: String = "The elders of egypt"
    override val option3: String = "Pharaoh's servants"
    override val option4: String = "His father's house"
    override val options: List<String> = shuffledOptions
}
