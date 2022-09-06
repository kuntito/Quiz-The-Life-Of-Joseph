package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question39: Question() {
    override val id: Int = 3739
    override val question: String = "Joseph's brother dipped his coat in the blood of a?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Kid",
        37,
        listOf(31)
    )
    override val option2: String = "Goat"
    override val option3: String = "Sheep"
    override val option4: String = "Cow"
    override val options: List<String> = shuffledOptions
}
