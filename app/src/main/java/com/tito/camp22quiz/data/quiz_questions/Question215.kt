package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question215: Question() {
    override val id: Int = 371
    override val question: String = "Which of Joseph's dreams involved the binding of sheaves?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His first dream",
        37,
        listOf(5,6,7)
    )
    override val option2: String = "His second dream"
    override val option3: String = "His third dream"
    override val option4: String = "He never had this dream"
    override val options: List<String> = shuffledOptions
}
