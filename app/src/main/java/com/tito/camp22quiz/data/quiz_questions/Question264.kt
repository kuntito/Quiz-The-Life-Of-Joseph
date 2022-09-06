package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question264: Question() {
    override val id: Int = 4932
    override val question: String = "__________ shall ravin as a wolf, according to Jacob in Gen 49?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Benjamin",
        49,
        listOf(27)
    )
    override val option2: String = "Zebulun"
    override val option3: String = "Issachar"
    override val option4: String = "Joseph"
    override val options: List<String> = shuffledOptions
}
