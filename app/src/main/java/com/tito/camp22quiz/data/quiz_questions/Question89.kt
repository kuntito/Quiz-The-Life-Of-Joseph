package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question89: Question() {
    override val id: Int = 417
    override val question: String = "Who suggested Joseph could interpret Pharaoh's dream?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The chief butler",
        41,
        listOf(12)
    )
    override val option2: String = "The chief baker"
    override val option3: String = "One of the magicians"
    override val option4: String = "One of the wisemen"
    override val options: List<String> = shuffledOptions
}
