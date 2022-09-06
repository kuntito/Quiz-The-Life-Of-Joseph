package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question242: Question() {
    override val id: Int = 4920
    override val question: String = "Issachar saw that _____ was good and the land that it was _________, according to Jacob in Gen 49"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Rest, pleasant",
        49,
        listOf(15)
    )
    override val option2: String = "fruits, fruitful"
    override val option3: String = "produce, buoyant"
    override val option4: String = "produce, pleasant"
    override val options: List<String> = shuffledOptions
}
