package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question230: Question() {
    override val id: Int = 498
    override val question: String = "On Jacob's death bed, who did he say tell \"thy father's children shall bow before thee\""
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Judah",
        49,
        listOf(8)
    )
    override val option2: String = "Levi"
    override val option3: String = "Dan"
    override val option4: String = "Naphthali"
    override val options: List<String> = shuffledOptions
}
