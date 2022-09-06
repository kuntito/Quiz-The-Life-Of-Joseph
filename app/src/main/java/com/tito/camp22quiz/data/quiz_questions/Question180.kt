package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question180: Question() {
    override val id: Int = 475
    override val question: String = "What did Jacob do before leaving Pharaoh's presence?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He blessed Pharaoh",
        47,
        listOf(10)
    )
    override val option2: String = "He changed it for Pharaoh again"
    override val option3: String = "He thanked God"
    override val option4: String = "He was greeted him goodbye"
    override val options: List<String> = shuffledOptions
}
