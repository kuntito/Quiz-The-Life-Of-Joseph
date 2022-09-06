package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question95: Question() {
    override val id: Int = 4113
    override val question: String = "Why did Joseph say the dream was doubled unto Pharoah?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "It is because the thing is established by God",
        41,
        listOf(32)
    )
    override val option2: String = "It is because Pharaoh is forgetful"
    override val option3: String = "The dreams have separate meanings"
    override val option4: String = "It is because Pharaoh is an egyptian"
    override val options: List<String> = shuffledOptions
}
