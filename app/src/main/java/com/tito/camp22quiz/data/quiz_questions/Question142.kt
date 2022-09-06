package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question142: Question() {
    override val id: Int = 4314
    override val question: String = "Apart from the children of Jacob, who else ate at Joseph's house?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The egyptians",
        43,
        listOf(32)
    )
    override val option2: String = "Jacob"
    override val option3: String = "Rachel"
    override val option4: String = "The Ishmeelites"
    override val options: List<String> = shuffledOptions
}
