package com.tito.camp22quiz.data.quiz_chapters

import com.tito.camp22quiz.model.Chapter
import com.tito.camp22quiz.model.Verse

val verse0 = Verse(0, "", 0, "N/A")
object Gen0: Chapter() {
    override val id: String = "Gen0"
    override val number: Int = 0
    override val verses: List<Verse> = listOf(
        verse0
    )
}