package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question219: Question() {
    override val id: Int = 375
    override val question: String = "What was the response of Joseph's brethren to his second dream?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They envied him",
        37,
        listOf(9,10,11)
    )
    override val option2: String = "They fought him"
    override val option3: String = "They protected him"
    override val option4: String = "The besoought for him evil"
    override val options: List<String> = shuffledOptions
}
