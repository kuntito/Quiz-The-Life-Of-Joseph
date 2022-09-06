package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question19: Question() {
    override val id: Int = 3719
    override val question: String = "Why did Jacob send Joseph to his brothers feeding the flock?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "To see whether it was well with them and the flock",
        37,
        listOf(14)
    )
    override val option2: String = "To give them a message"
    override val option3: String = "To give them their afternoon meal"
    override val option4: String = "To see whether it was well with the flock"
    override val options: List<String> = shuffledOptions
}
