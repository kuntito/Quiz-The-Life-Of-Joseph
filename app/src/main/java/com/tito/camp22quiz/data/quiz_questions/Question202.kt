package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question202: Question() {
    override val id: Int = 493
    override val question: String = "When telling his children what would befall them in their last days, what did Jacob call Joseph?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "A fruitful bough",
        49,
        listOf(22)
    )
    override val option2: String = "A fruitful man"
    override val option3: String = "A blessed man"
    override val option4: String = "A blessing"
    override val options: List<String> = shuffledOptions
}
