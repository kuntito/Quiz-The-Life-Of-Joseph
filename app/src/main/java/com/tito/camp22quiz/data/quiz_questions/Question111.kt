package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question111: Question() {
    override val id: Int = 422
    override val question: String = "What did Jacob say to his sons when he saw there was corn in Egypt?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Why do ye look upon another?",
        42,
        listOf(1)
    )
    override val option2: String = "Go and get food for us"
    override val option3: String = "Why does God favour the egyptians?"
    override val option4: String = "Why has God forsaken me?"
    override val options: List<String> = shuffledOptions
}
