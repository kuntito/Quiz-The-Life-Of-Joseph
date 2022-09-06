package com.tito.camp22quiz.ui.fragments.search_view_listeners

import androidx.appcompat.widget.SearchView
import com.tito.camp22quiz.model.Chapter
import com.tito.camp22quiz.model.Verse
import com.tito.camp22quiz.ui.fragments.misc_functions.MiscFunctions.doSearch

object GlobalSearchListener: SearchView.OnQueryTextListener {
    override fun onQueryTextSubmit(query: String?): Boolean {
        return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        if (newText != null) {

        }
        return false
    }

}