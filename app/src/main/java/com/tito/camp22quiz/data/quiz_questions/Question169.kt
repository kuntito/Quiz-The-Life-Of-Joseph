package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question169: Question() {
    override val id: Int = 4515
    override val question: String = "What was Jacob's reaction to seeing the wagons Joseph sent to him?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His spirit revived",
        45,
        listOf(27)
    )
    override val option2: String = "He was overjoyed"
    override val option3: String = "He was scared"
    override val option4: String = "He was humbled"
    override val options: List<String> = shuffledOptions
}
