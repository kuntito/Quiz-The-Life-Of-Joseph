package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question66: Question() {
    override val id: Int = 402
    override val question: String = "Why did Pharaoh imprison the chief butler?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He offended him",
        40,
        listOf(1)
    )
    override val option2: String = "He was lazy"
    override val option3: String = "He drank Pharaoh's wine"
    override val option4: String = "His wine was not sweet"
    override val options: List<String> = shuffledOptions
}
