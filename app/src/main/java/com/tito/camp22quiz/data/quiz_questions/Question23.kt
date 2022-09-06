package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question23: Question() {
    override val id: Int = 3723
    override val question: String = "How did the man have an idea where Joseph's brothers were?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He overhead them speaking",
        37,
        listOf(17)
    )
    override val option2: String = "They told him"
    override val option3: String = "He was supposed to go with them"
    override val option4: String = "He was coming from where they were"
    override val options: List<String> = shuffledOptions
}
