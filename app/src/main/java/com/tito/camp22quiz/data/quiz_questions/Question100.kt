package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question100: Question() {
    override val id: Int = 4118
    override val question: String = "What name did Pharaoh give unto Joseph?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Zaphnathpaaneah",
        41,
        listOf(45)
    )
    override val option2: String = "Abelmizraim"
    override val option3: String = "Methuselah-Judea"
    override val option4: String = "Jezreel"
    override val options: List<String> = shuffledOptions
}
