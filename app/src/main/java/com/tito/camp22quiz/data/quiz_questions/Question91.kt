package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question91: Question() {
    override val id: Int = 419
    override val question: String = "Joseph said to Pharaoh \"God shall give Pharaoh an answer of …..\""
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Peace",
        41,
        listOf(16)
    )
    override val option2: String = "Comfort"
    override val option3: String = "Grace"
    override val option4: String = "Mercy"
    override val options: List<String> = shuffledOptions
}
