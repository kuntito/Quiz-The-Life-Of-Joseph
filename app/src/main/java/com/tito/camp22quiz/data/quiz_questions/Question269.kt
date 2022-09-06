package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question269: Question() {
    override val id: Int = 4937
    override val question: String = "What did Jacob do right before he died?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He gathered up his feet into the bed",
        49,
        listOf(33)
    )
    override val option2: String = "He commanded his sons"
    override val option3: String = "He gave them their inheritance"
    override val option4: String = "He blessed them"
    override val options: List<String> = shuffledOptions
}
