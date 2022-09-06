package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question186: Question() {
    override val id: Int = 4711
    override val question: String = "After their cattle ran out, the egyptians came to Joseph and said they only have their ______ and ______ left"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Bodies and lands",
        47,
        listOf(18)
    )
    override val option2: String = "Lands and bodies"
    override val option3: String = "Sheep and goats"
    override val option4: String = "goats and sheep"
    override val options: List<String> = shuffledOptions
}
