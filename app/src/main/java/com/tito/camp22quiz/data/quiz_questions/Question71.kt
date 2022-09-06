package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question71: Question() {
    override val id: Int = 407
    override val question: String = "To whom did Joseph say the interpretations belong?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "God",
        40,
        listOf(8)
    )
    override val option2: String = "The Almighty"
    override val option3: String = "Yahweh"
    override val option4: String = "Jireh"
    override val options: List<String> = shuffledOptions
}
