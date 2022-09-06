package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question246: Question() {
    override val id: Int = 4924
    override val question: String = "Out of ___ his bread shall be ____? Jacob spoke this on his death bed"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Asher, fat",
        49,
        listOf(19)
    )
    override val option2: String = "Zebulun, unleavened"
    override val option3: String = "Asher, leavened"
    override val option4: String = "Joseph, leavened"
    override val options: List<String> = shuffledOptions
}
