package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question265: Question() {
    override val id: Int = 4933
    override val question: String = "\"in the morning he shall devour the prey, and at night he shall divide the spoil\", who did Jacob say this about?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Benjamin",
        49,
        listOf(27)
    )
    override val option2: String = "Joseph"
    override val option3: String = "Issachar"
    override val option4: String = "Zebulun"
    override val options: List<String> = shuffledOptions
}
