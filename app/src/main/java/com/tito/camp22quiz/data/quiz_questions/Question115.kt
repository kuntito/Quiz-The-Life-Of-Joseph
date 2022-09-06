package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question115: Question() {
    override val id: Int = 426
    override val question: String = "When Joseph’s brothers came before him the first time, what did they do?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They bowed down before him with their faces to the earth?",
        42,
        listOf(6)
    )
    override val option2: String = "They praised him for fear of punishment"
    override val option3: String = "They asked where they could get food"
    override val option4: String = "They pleaded for mercy"
    override val options: List<String> = shuffledOptions
}
