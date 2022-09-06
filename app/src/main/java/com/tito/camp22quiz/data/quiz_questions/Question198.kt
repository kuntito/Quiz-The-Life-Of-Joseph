package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question198: Question() {
    override val id: Int = 488
    override val question: String = "What displeased Joseph when Jacob placed his hands on his sons?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Jacob didn't place his right hand on the firstborn",
        48,
        listOf(17,18)
    )
    override val option2: String = "Jacob didn't wash his hands first"
    override val option3: String = "Jacob had covid"
    override val option4: String = "He wasn't displeased"
    override val options: List<String> = shuffledOptions
}
