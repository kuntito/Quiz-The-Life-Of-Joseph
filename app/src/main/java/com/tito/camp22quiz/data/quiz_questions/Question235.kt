package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question235: Question() {
    override val id: Int = 4913
    override val question: String = "On Jacob's death bed, who did he say this to? \"and his ass's colt unto the choic vine; he washed his garments in wine, and his clothes in the blood of grapes\""
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Judah",
        49,
        listOf(8,9,10,11)
    )
    override val option2: String = "Reuben"
    override val option3: String = "Levi"
    override val option4: String = "Issachar"
    override val options: List<String> = shuffledOptions
}
