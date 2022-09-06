package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question107: Question() {
    override val id: Int = 4125
    override val question: String = "Why did Joseph name his son Ephraim?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "God caused him to be fruitful in the land of his affliction",
        41,
        listOf(52)
    )
    override val option2: String = "God fulfilled his promise"
    override val option3: String = "That was the name given to the first borns in his family"
    override val option4: String = "He was joyful"
    override val options: List<String> = shuffledOptions
}
