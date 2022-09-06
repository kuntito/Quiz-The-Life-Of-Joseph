package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question146: Question() {
    override val id: Int = 441
    override val question: String = "Who did Joseph order to put his brother's money back in their sacks?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The steward of his house",
        44,
        listOf(1)
    )
    override val option2: String = "Benjamin"
    override val option3: String = "The palace guards"
    override val option4: String = "Jakub"
    override val options: List<String> = shuffledOptions
}
