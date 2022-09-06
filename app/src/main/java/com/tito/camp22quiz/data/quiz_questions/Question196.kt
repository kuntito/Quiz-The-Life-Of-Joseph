package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question196: Question() {
    override val id: Int = 486
    override val question: String = "Jacob buried Rachel in the way of ______"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Ephrath, the same is Bethlehem",
        48,
        listOf(7)
    )
    override val option2: String = "Euphrates, the same is Bethlehem"
    override val option3: String = "Euraph, the same in Judea"
    override val option4: String = "Euphrates, the same is Luz"
    override val options: List<String> = shuffledOptions
}
