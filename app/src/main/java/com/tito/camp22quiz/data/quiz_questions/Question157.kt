package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question157: Question() {
    override val id: Int = 453
    override val question: String = "Why couldn’t Joseph's brethren answer him when he introduced himself as Joseph"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They were troubled at his presence",
        45,
        listOf(3)
    )
    override val option2: String = "They were scared of him"
    override val option3: String = "They were confused"
    override val option4: String = "They were relieved"
    override val options: List<String> = shuffledOptions
}
