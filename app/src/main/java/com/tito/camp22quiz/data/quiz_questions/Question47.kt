package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question47: Question() {
    override val id: Int = 385
    override val question: String = "What's the name of the father of Judah's wife"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Shuah",
        38,
        listOf(12)
    )
    override val option2: String = "Hirah"
    override val option3: String = "Shelah"
    override val option4: String = "Tamar"
    override val options: List<String> = shuffledOptions
}
