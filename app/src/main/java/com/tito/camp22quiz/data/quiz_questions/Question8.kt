package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question8: Question() {
    override val id: Int = 378
    override val question: String = "Why did Jacob love Joseph the most?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He was the son of his old age",
        37,
        listOf(3)
    )
    override val option2: String = "Joseph's mother was his favourite wife"
    override val option3: String = "Joseph was very obedient"
    override val option4: String = "Joseph brought to him his brothers evil report"
    override val options: List<String> = shuffledOptions
}
