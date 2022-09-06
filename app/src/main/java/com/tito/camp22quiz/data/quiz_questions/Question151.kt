package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question151: Question() {
    override val id: Int = 446
    override val question: String = "What did Joseph's brother's do when the cup was found in Benjamin's sack?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They rent their clothes and returned to the city",
        44,
        listOf(13)
    )
    override val option2: String = "They cried out"
    override val option3: String = "They asked why God had forsaken them again"
    override val option4: String = "They asked why God had forsaken them"
    override val options: List<String> = shuffledOptions
}
