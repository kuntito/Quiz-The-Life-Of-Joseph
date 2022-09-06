package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question206: Question() {
    override val id: Int = 503
    override val question: String = "How long did the egyptians mourn Jacob for?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Threescore and ten days",
        50,
        listOf(3)
    )
    override val option2: String = "Twoscore and five days"
    override val option3: String = "Eightscore and ten days"
    override val option4: String = "Threescore and fifteen days"
    override val options: List<String> = shuffledOptions
}
