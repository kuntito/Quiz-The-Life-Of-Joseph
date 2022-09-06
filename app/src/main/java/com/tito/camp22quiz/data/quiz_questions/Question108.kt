package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question108: Question() {
    override val id: Int = 4126
    override val question: String = "What did Pharoah say to the people when they cried to him for bread?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "Go unto Joseph",
        41,
        listOf(55)
    )
    override val option2: String = "Go and buy bread"
    override val option3: String = "Get thee behind me"
    override val option4: String = "I will feed you"
    override val options: List<String> = shuffledOptions
}
