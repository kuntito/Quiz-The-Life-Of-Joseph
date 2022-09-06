package com.tito.camp22quiz.data

import com.tito.camp22quiz.data.quiz_chapters.kjv.KJV
import com.tito.camp22quiz.data.quiz_chapters.niv.NIV
import com.tito.camp22quiz.model.Chapter

private const val expectedChapterCount = 14
object QuizChapters {
    val kjvChapters = KJV.chapters
    private val nivChapters = NIV.chapters
    val allVersions = listOf(
        kjvChapters, nivChapters
    )

    init {
        ensureChapterCount()
    }

    fun getChapter(chapterPosition: Int, version: String): Chapter{
        val chapterToSearch = when(version.uppercase()){
            "KJV" -> kjvChapters
            "NIV" -> nivChapters
            else -> throw Exception("unknown version $version")
        }
        return chapterToSearch[chapterPosition]
    }

    val chapterCount = ensureChapterCount()
    val genericChapterIds = nivChapters.map { "Gen\n${it.number}" }
    val chapterNumbers = nivChapters.map { it.number }

    private fun ensureChapterCount(): Int{
        if (!allVersions.all{it.size == expectedChapterCount}) throw Exception("All chapters not the same size")
        return expectedChapterCount
    }

}