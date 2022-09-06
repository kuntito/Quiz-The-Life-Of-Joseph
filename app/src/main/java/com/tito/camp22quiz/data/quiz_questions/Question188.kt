package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question188: Question() {
    override val id: Int = 4713
    override val question: String = "Why didn’t the priests sell their land?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Pharaoh gave them a portion of food",
        47,
        listOf(22)
    )
    override val option2: String = "Pharaoh pleaded with Joseph on their behald"
    override val option3: String = "They pleaded with Joseph"
    override val option4: String = "Joseph had respect for the priests"
    override val options: List<String> = shuffledOptions
}
