package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question209: Question() {
    override val id: Int = 506
    override val question: String = "When going to bury his father, Joseph and his company stopped where to mourn?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The threshing floor of Atad",
        50,
        listOf(10)
    )
    override val option2: String = "The threshing floor of Atan"
    override val option3: String = "The threshing floor of Usman"
    override val option4: String = "The threshing floor of Atak"
    override val options: List<String> = shuffledOptions
}
