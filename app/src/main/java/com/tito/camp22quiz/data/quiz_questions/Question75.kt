package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question75: Question() {
    override val id: Int = 4011
    override val question: String = "What did Joseph request from the chief butler?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Make mention of me to Pharaoh",
        40,
        listOf(14)
    )
    override val option2: String = "Send word to my father"
    override val option3: String = "Send word to my brethren"
    override val option4: String = "Send word to Potiphar"
    override val options: List<String> = shuffledOptions
}
