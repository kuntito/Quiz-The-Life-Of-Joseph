package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question240: Question() {
    override val id: Int = 4918
    override val question: String = "Dan shall judge his __________, according to Jacob in Gen 49?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "People",
        49,
        listOf(16)
    )
    override val option2: String = "Children"
    override val option3: String = "Servants"
    override val option4: String = "Slaves"
    override val options: List<String> = shuffledOptions
}
