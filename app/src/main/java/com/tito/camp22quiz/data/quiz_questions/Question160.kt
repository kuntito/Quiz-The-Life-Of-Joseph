package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question160: Question() {
    override val id: Int = 456
    override val question: String = "What happened after Joseph wept on Benjamin's neck?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Benjamin wept on his neck",
        45,
        listOf(14)
    )
    override val option2: String = "Benjamin ran away"
    override val option3: String = "Benjamin wiped his tears off"
    override val option4: String = "Benjamin changed it for him"
    override val options: List<String> = shuffledOptions
}
