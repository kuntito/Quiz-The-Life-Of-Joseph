package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question127: Question() {
    override val id: Int = 4218
    override val question: String = "At Joseph's house, What did his brothers do after they were given water?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They washed their feet",
        42,
        listOf(24)
    )
    override val option2: String = "They drank it"
    override val option3: String = "They thanked God"
    override val option4: String = "They blessed it"
    override val options: List<String> = shuffledOptions
}
