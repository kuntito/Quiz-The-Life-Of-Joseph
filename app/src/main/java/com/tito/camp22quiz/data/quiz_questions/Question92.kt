package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question92: Question() {
    override val id: Int = 4110
    override val question: String = "What did Joseph say to  Pharaoh after hearing both dreams?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The dream of Pharaoh is one",
        41,
        listOf(25)
    )
    override val option2: String = "God wil give unto me the interpretation"
    override val option3: String = "The dream is a foretelling of things to come"
    override val option4: String = "God help me"
    override val options: List<String> = shuffledOptions
}
