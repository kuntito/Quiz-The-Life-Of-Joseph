package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question21: Question() {
    override val id: Int = 3721
    override val question: String = "Who found Joseph wandering in the field?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "A certain man",
        37,
        listOf(15)
    )
    override val option2: String = "Shuah"
    override val option3: String = "An adullamite"
    override val option4: String = "Hirah"
    override val options: List<String> = shuffledOptions
}
