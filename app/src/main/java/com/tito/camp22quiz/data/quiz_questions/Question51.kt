package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question51: Question() {
    override val id: Int = 393
    override val question: String = "When Potiphar realized Joseph was prosperous, what did he do?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He made Joseph the overseer of his house",
        39,
        listOf(4)
    )
    override val option2: String = "He made Joseph the leader of his house"
    override val option3: String = "He made Joseph the head guard of his house"
    override val option4: String = "He made Joseph his assistant"
    override val options: List<String> = shuffledOptions
}
