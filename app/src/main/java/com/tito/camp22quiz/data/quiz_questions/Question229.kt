package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question229: Question() {
    override val id: Int = 497
    override val question: String = "What did simeon and levi do in their anger?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They digged down a wall",
        49,
        listOf(6)
    )
    override val option2: String = "They caused fights in family meetings"
    override val option3: String = "They killed animals for fun"
    override val option4: String = "They burnt down their house"
    override val options: List<String> = shuffledOptions
}
