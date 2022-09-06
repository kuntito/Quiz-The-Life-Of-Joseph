package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question46: Question() {
    override val id: Int = 384
    override val question: String = "Who was supposed to marry Tamar when he grew up?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Shelah",
        38,
        listOf(11)
    )
    override val option2: String = "Jacob"
    override val option3: String = "Onan"
    override val option4: String = "Shuah"
    override val options: List<String> = shuffledOptions
}
