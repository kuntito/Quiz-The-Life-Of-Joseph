package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question155: Question() {
    override val id: Int = 451
    override val question: String = "What did Joseph do before making himself known to his brethren?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He caused every man to go out of the room",
        45,
        listOf(1)
    )
    override val option2: String = "He swore by his first born"
    override val option3: String = "He called Pharaoh"
    override val option4: String = "He took of his royal robe"
    override val options: List<String> = shuffledOptions
}
