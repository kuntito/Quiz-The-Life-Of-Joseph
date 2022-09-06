package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question178: Question() {
    override val id: Int = 473
    override val question: String = "What did Jacob do when he was brought into Pharaoh's presence?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He blessed Pharaoh",
        47,
        listOf(7)
    )
    override val option2: String = "He cursed Pharaoh"
    override val option3: String = "He changed it for Pharaoh for keeping his son in egypt"
    override val option4: String = "He thanked God"
    override val options: List<String> = shuffledOptions
}
