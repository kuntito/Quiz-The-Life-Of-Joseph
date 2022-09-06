package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question164: Question() {
    override val id: Int = 4510
    override val question: String = "What did Joseph give Benjamin when his brethren went to get their father from Canaan?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Three hundred pieces of silver and five changes of raiment",
        45,
        listOf(22)
    )
    override val option2: String = "Two hundred pieces of silver and four changes of raiment"
    override val option3: String = "Six hundred pieces of silver and three changes of raiment"
    override val option4: String = "Four hundred pieces of silver and three changes of raiment"
    override val options: List<String> = shuffledOptions
}
