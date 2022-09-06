package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question10: Question() {
    override val id: Int = 3710
    override val question: String = "Why did Joseph's brothers hate him?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Jacob loved him the more than all of them",
        37,
        listOf(4)
    )
    override val option2: String = "Joseph brought their evil reports to Jacob"
    override val option3: String = "Joseph was proud"
    override val option4: String = "Joseph's mother was Jacob's favourite"
    override val options: List<String> = shuffledOptions
}
