package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question29: Question() {
    override val id: Int = 3729
    override val question: String = "What was the first thing Joseph's brothers did when he got to them?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They stripped him of his coat of many colours",
        37,
        listOf(23)
    )
    override val option2: String = "They threw him in a pit"
    override val option3: String = "They forcefully collected the bread from his hand"
    override val option4: String = "They harassed him"
    override val options: List<String> = shuffledOptions
}
