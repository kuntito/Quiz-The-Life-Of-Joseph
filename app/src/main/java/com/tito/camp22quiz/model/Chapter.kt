package com.tito.camp22quiz.model

abstract class Chapter() {
    abstract val id: String
    abstract val number: Int
    abstract val verses: List<Verse>
    open val versesCount: Int
        get() = verses.size
}
