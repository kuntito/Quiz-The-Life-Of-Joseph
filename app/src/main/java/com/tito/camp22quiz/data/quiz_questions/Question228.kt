package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question228: Question() {
    override val id: Int = 496
    override val question: String = "What did simeon and levi do in their anger?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They slew a man",
        49,
        listOf(6)
    )
    override val option2: String = "They argued violently"
    override val option3: String = "They caused fights in family meetings"
    override val option4: String = "They killed animals for fun"
    override val options: List<String> = shuffledOptions
}
