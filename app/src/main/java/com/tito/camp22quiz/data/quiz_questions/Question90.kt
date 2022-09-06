package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question90: Question() {
    override val id: Int = 418
    override val question: String = "What did Joseph do before coming into Pharaoh's presence?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He shaved and changed his raiment",
        41,
        listOf(14)
    )
    override val option2: String = "He had a bath"
    override val option3: String = "He changed his raiment"
    override val option4: String = "He cut his hair and had a bath and changed his raiment"
    override val options: List<String> = shuffledOptions
}
