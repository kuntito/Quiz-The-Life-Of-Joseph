package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question141: Question() {
    override val id: Int = 4313
    override val question: String = "Where did Joseph weep upon seeing Benjamin?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "His chamber",
        43,
        listOf(30)
    )
    override val option2: String = "In front of his brethren"
    override val option3: String = "In silence"
    override val option4: String = "Pharaoh's presence"
    override val options: List<String> = shuffledOptions
}
