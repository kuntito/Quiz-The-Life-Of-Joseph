package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question24: Question() {
    override val id: Int = 3724
    override val question: String = "When did Joseph's brother conspire against him to slay him?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "At Dothan, When they saw him afar off",
        37,
        listOf(18)
    )
    override val option2: String = "At Canaan, When he told them his second dream"
    override val option3: String = "At Dothan, When he gave them their father's message"
    override val option4: String = "At Canaan, When they saw him afar off"
    override val options: List<String> = shuffledOptions
}
