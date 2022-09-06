package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question216: Question() {
    override val id: Int = 372
    override val question: String = "\"shalt thou indeed reign over us? Or shalt thou indeed have dominion over us?\" was a response to which of Joseph's dreams?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His first dream",
        37,
        listOf(5,6,7,8)
    )
    override val option2: String = "His second dream"
    override val option3: String = "His third dream"
    override val option4: String = "He never had this dream"
    override val options: List<String> = shuffledOptions
}
