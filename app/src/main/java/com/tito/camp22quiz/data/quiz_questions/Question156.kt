package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question156: Question() {
    override val id: Int = 452
    override val question: String = "Who heard when Joseph wept aloud?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The Egyptians and the house of pharaoh",
        45,
        listOf(2)
    )
    override val option2: String = "Pharaoh's wife, Jolene"
    override val option3: String = "Jacob"
    override val option4: String = "Rachel"
    override val options: List<String> = shuffledOptions
}
