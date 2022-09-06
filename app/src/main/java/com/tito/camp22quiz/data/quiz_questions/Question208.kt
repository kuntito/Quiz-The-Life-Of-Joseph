package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question208: Question() {
    override val id: Int = 505
    override val question: String = "Who was left behind at Goshen when Joseph went to bury his father?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The little ones",
        50,
        listOf(8)
    )
    override val option2: String = "Abel"
    override val option3: String = "Cain"
    override val option4: String = "John cena"
    override val options: List<String> = shuffledOptions
}
