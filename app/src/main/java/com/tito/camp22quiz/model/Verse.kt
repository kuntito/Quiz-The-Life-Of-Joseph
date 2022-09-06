package com.tito.camp22quiz.model

import android.text.Spanned

data class Verse (
    val number: Int,
    val text: String,
    val chapterNumber: Int,
    val versionName: String,
    var colouredText: Spanned? = null
)