package com.tito.camp22quiz.data.quiz_questions

import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuestionAnswer

object Question135: Question() {
    override val id: Int = 437
    override val question: String = "What did Joseph do when he saw Benjamin?"
    override val questionAnswer: QuestionAnswer = QuestionAnswer(
        "He told the ruler of his house to bring his brothers into his house",
        43,
        listOf(16)
    )
    override val option2: String = "He embraced and kissed him"
    override val option3: String = "He wept"
    override val option4: String = "He was nostalgic"
    override val options: List<String> = shuffledOptions
}
