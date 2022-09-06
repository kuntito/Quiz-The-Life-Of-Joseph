package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question49: Question() {
    override val id: Int = 391
    override val question: String = "Joseph was bought from the hands of?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Ishmeelites",
        39,
        listOf(1)
    )
    override val option2: String = "Amorites"
    override val option3: String = "Hittites"
    override val option4: String = "Adullamites"
    override val options: List<String> = shuffledOptions
}
