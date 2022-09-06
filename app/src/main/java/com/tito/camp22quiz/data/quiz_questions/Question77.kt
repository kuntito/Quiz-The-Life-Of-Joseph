package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question77: Question() {
    override val id: Int = 4013
    override val question: String = "Why did the chief baker tell Joseph his dream?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The chief butler had a good interpretation to his dream",
        40,
        listOf(16)
    )
    override val option2: String = "He believed Joseph could interpret dreams"
    override val option3: String = "He just tried his luck"
    override val option4: String = "He was led to do so"
    override val options: List<String> = shuffledOptions
}
