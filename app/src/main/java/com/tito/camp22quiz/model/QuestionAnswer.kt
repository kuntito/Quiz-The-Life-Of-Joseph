package com.tito.camp22quiz.model

import com.tito.camp22quiz.data.QuizChapters.kjvChapters
import com.tito.camp22quiz.data.quiz_chapters.verse0

data class QuestionAnswer (
    val answer: String,
    val chapter_number: Int,
    val verse_numbers: List<Int>,
){
    val references:List<Verse>
        get(){
            val referenceVerses = mutableListOf<Verse>()
            for (verse_number in verse_numbers){
                val verse = kjvChapters.find{it.number == chapter_number}?.
                    verses?.find { it.number == verse_number } ?: verse0
                referenceVerses.add(verse)
            }
            return referenceVerses
        }
    val verse_s: String
        get(){
            verse_numbers.let{
                return if(it.size == 1)
                    it[0].toString()
                else
                    "${it[0]}-${it.last()}"
            }
        }

}