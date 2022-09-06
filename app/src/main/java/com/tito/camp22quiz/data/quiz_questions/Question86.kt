package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question86: Question() {
    override val id: Int = 414
    override val question: String = "What happened after the ill favoured kine ate the well favoured kine"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Pharaoh woke up",
        41,
        listOf(4)
    )
    override val option2: String = "Pharaoh had another dream"
    override val option3: String = "Pharaoh was confused"
    override val option4: String = "Pharaoh called the wisemen"
    override val options: List<String> = shuffledOptions
}
