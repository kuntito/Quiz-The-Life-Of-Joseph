package com.tito.camp22quiz.model

abstract class Question {
    abstract val id: Int
    abstract val question: String
    abstract val questionAnswer: QuestionAnswer
    abstract val option2: String
    abstract val option3: String
    abstract val option4: String
    abstract val options: List<String>
    var selectedOptionId: Int? = null
    var selectedAnswer: String? = null
    val userCorrect: Boolean
        get() = selectedAnswer == questionAnswer.answer

    private val option1: String
        get() = questionAnswer.answer

    val shuffledOptions
        get()= listOf(
            option1,
            option2,
            option3,
            option4
        ).shuffled()

    //TODO remove this override
    override fun toString(): String {
        return id.toString()
    }
}