package com.tito.camp22quiz

import kotlinx.coroutines.*


fun main() {
    val text = "I am Joseph the cyrene"
    val query = "joseph"

    val colouredVerseText = text.split(query, ignoreCase = true).joinToString("<font color=yellow>$query</font>"){
        "<font color=white>$it</font>"
    }

    println(colouredVerseText)

}