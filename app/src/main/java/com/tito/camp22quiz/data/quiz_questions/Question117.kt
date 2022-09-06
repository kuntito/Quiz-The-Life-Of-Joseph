package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question117: Question() {
    override val id: Int = 428
    override val question: String = "What condition did Joseph give to his brothers in order for them to buy food?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He told them to bring their youngest brother",
        42,
        listOf(15)
    )
    override val option2: String = "He told them to bring their father"
    override val option3: String = "He told them to bow down before him"
    override val option4: String = "He told them to pay double"
    override val options: List<String> = shuffledOptions
}
