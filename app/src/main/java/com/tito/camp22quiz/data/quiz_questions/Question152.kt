package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question152: Question() {
    override val id: Int = 447
    override val question: String = "Who was said to have gone to Joseph's house after the cup was found in Benjamin's sack?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Judah and his brethren",
        44,
        listOf(14)
    )
    override val option2: String = "Reuben and his brethren"
    override val option3: String = "Simeon and his brethren"
    override val option4: String = "Levi and his brethren"
    override val options: List<String> = shuffledOptions
}
