package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question58: Question() {
    override val id: Int = 3910
    override val question: String = "Why did Joseph leave his garment with Potiphar's wife?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "She caught it and insisted he lie with her",
        39,
        listOf(12)
    )
    override val option2: String = "He didn't like wearing garments"
    override val option3: String = "He didn't leave his garment with her"
    override val option4: String = "She begged him to leave it with her"
    override val options: List<String> = shuffledOptions
}
