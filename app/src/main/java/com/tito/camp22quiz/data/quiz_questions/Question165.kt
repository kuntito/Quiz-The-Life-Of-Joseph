package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question165: Question() {
    override val id: Int = 4511
    override val question: String = "What did Joseph give to all his brothers when they were going to get Jacob?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "A change of raiment",
        45,
        listOf(22)
    )
    override val option2: String = "Blessings"
    override val option3: String = "Prayer"
    override val option4: String = "Curses"
    override val options: List<String> = shuffledOptions
}
