package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question42: Question() {
    override val id: Int = 3742
    override val question: String = "How is Potiphar addressed?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Captain of Pharaoh's guards",
        37,
        listOf(36)
    )
    override val option2: String = "Leader of Pharaoh's guards"
    override val option3: String = "Chief of Pharaoh's guards"
    override val option4: String = "Head of Pharaoh's guards"
    override val options: List<String> = shuffledOptions
}
