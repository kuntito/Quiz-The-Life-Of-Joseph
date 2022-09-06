package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question15: Question() {
    override val id: Int = 3715
    override val question: String = "\"and they hated him yet the more for his dreams, and for his ____\"?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Words",
        37,
        listOf(8)
    )
    override val option2: String = "Interpretations"
    override val option3: String = "Behaviour"
    override val option4: String = "Coat of many colours"
    override val options: List<String> = shuffledOptions
}
