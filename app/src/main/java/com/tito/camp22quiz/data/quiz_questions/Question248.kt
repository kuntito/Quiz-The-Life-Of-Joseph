package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question248: Question() {
    override val id: Int = 4926
    override val question: String = "_________ is a hind let loose, he giveth goodly words, who did Jacob say this about in Gen 49?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Napthali",
        49,
        listOf(21)
    )
    override val option2: String = "Asher"
    override val option3: String = "Benjamin"
    override val option4: String = "Zebulun"
    override val options: List<String> = shuffledOptions
}
