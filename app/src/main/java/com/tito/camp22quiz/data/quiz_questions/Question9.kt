package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question9: Question() {
    override val id: Int = 379
    override val question: String = "The coat of many colours resulted from what?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Jacob's love for Joseph",
        37,
        listOf(3)
    )
    override val option2: String = "Jacob's interest in making coats"
    override val option3: String = "Joseph asking for new clothes"
    override val option4: String = "Jacob wanting to give him a gift"
    override val options: List<String> = shuffledOptions
}
