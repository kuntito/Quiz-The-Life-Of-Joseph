package com.tito.camp22quiz.data

import com.tito.camp22quiz.model.BibleVersion

object BibleVersions {
    val  selectedBibleVersions = listOf<BibleVersion>(
        BibleVersion(0, "KJV"),
        BibleVersion(1, "NIV")
    )
}