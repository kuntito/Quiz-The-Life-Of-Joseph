package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question4: Question() {
    override val id: Int = 374
    override val question: String = "In Gen 37, Who was Joseph with when feeding the flock?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His brothers: the sons of Bilhah and Zilpah",
        37,
        listOf(2)
    )
    override val option2: String = "Jacob, Benjamin and Simeon"
    override val option3: String = "Jacob's servants"
    override val option4: String = "The Egyptians"
    override val options: List<String> = shuffledOptions
}
