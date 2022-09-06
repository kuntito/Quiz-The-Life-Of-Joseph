package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question147: Question() {
    override val id: Int = 442
    override val question: String = "What cup was put in the mouth of Benjamin's sack?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Joseph's silver cup",
        44,
        listOf(2)
    )
    override val option2: String = "Pharaoh's wine cup"
    override val option3: String = "A gold cup"
    override val option4: String = "A bronze cup"
    override val options: List<String> = shuffledOptions
}
