package com.tito.camp22quiz.ui.fragments.search_view_listeners
import android.util.Log
import androidx.appcompat.widget.SearchView

object LocalSearchListener: SearchView.OnQueryTextListener {
    override fun onQueryTextSubmit(query: String?): Boolean {
        return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        Log.d("Camp22", "Local movements")
        return false
    }

}