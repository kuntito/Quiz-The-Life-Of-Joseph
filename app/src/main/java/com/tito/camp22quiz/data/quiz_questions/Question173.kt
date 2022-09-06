package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question173: Question() {
    override val id: Int = 464
    override val question: String = "What did Joseph do when he met his father?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He fell on his neck and wept",
        46,
        listOf(29)
    )
    override val option2: String = "He shouted \"YE\""
    override val option3: String = "He was well pleased"
    override val option4: String = "He thanked God"
    override val options: List<String> = shuffledOptions
}
