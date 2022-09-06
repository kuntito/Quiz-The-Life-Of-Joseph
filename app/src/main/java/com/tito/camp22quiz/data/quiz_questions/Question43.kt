package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question43: Question() {
    override val id: Int = 381
    override val question: String = "Judah went from his brethren and turned to a certain Adullamite name?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Hirah",
        38,
        listOf(1)
    )
    override val option2: String = "Shuah"
    override val option3: String = "Er"
    override val option4: String = "Onan"
    override val options: List<String> = shuffledOptions
}
