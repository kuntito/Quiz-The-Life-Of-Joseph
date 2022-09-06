package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question149: Question() {
    override val id: Int = 444
    override val question: String = "When did Joseph send his steward to his brothers?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "When they had left the city and not yet far off",
        44,
        listOf(4)
    )
    override val option2: String = "Immediately they left his presence"
    override val option3: String = "When the spirit of God led him"
    override val option4: String = "When Pharaoh ordered him to"
    override val options: List<String> = shuffledOptions
}
