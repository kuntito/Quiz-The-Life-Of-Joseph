package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question85: Question() {
    override val id: Int = 413
    override val question: String = "Where did the ill favoured kine come from?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They came out of the river",
        41,
        listOf(3)
    )
    override val option2: String = "They came out of the bush"
    override val option3: String = "They came out of the forest"
    override val option4: String = "They came out of the wilderness"
    override val options: List<String> = shuffledOptions
}
