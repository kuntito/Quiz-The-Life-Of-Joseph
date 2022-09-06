package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question143: Question() {
    override val id: Int = 4315
    override val question: String = "In what order did Joseph's brothers sit at his house?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "First born to last born",
        43,
        listOf(33)
    )
    override val option2: String = "last born to first born"
    override val option3: String = "It wasn't stated"
    override val option4: String = "They were unordered"
    override val options: List<String> = shuffledOptions
}
