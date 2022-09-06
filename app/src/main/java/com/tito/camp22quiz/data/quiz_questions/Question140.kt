package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question140: Question() {
    override val id: Int = 4312
    override val question: String = "When Joseph came into the house, what did his brothers do?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "They brought him a present and bowed themselves to him to the earth",
        43,
        listOf(26)
    )
    override val option2: String = "They begged him for mercy"
    override val option3: String = "They pleaded with him using benjamin"
    override val option4: String = "They greeted him with kind words"
    override val options: List<String> = shuffledOptions
}
