package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question258: Question() {
    override val id: Int = 4936
    override val question: String = "Jacob said the purchase of the field and the cave therein was from the children of ________?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Heth",
        49,
        listOf(32)
    )
    override val option2: String = "Hittite"
    override val option3: String = "Ephron"
    override val option4: String = "Randy Orton"
    override val options: List<String> = shuffledOptions
}
