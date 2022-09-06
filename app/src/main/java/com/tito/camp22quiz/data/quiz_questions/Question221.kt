package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question221: Question() {
    override val id: Int = 377
    override val question: String = "How did Jacob respond when his sons and daughters comforted him?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He refused to be comforted",
        37,
        listOf(35)
    )
    override val option2: String = "He was comforted"
    override val option3: String = "He was comforted, but for a while"
    override val option4: String = "He was relieved"
    override val options: List<String> = shuffledOptions
}
