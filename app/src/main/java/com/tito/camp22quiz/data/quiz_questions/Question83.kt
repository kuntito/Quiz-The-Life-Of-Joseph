package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question83: Question() {
    override val id: Int = 411
    override val question: String = "Where did Pharaoh stand in his dream?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He stood by the river",
        41,
        listOf(1)
    )
    override val option2: String = "He stood in front of his palace"
    override val option3: String = "He stood behind the gate of Euphrates"
    override val option4: String = "He stood strong"
    override val options: List<String> = shuffledOptions
}
