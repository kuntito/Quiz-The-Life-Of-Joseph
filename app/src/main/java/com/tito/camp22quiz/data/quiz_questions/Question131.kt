package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question131: Question() {
    override val id: Int = 433
    override val question: String = "When did Jacob ask his children to go back to Egypt?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "After they had eaten up the corn they brought back",
        43,
        listOf(2)
    )
    override val option2: String = "When he realized they left their brother behind"
    override val option3: String = "When he realized their money was doubled"
    override val option4: String = "After Reuben had spoken to him"
    override val options: List<String> = shuffledOptions
}
