package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question203: Question() {
    override val id: Int = 494
    override val question: String = "Where did Jacob ask to be buried?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "The cave in the field of Ephron, the hittite",
        49,
        listOf(29)
    )
    override val option2: String = "The cave in the field of Ephrath, the midianite"
    override val option3: String = "The cave in the field of Ephrath, the canaanite"
    override val option4: String = "The field in the cave of Ephron, the hittite"
    override val options: List<String> = shuffledOptions
}
