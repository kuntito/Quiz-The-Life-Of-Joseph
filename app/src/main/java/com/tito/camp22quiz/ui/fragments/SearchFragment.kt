package com.tito.camp22quiz.ui.fragments

import android.os.Build
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.widget.SearchView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import com.tito.camp22quiz.R
import com.tito.camp22quiz.data.QuizChapters.chapterNumbers
import com.tito.camp22quiz.data.QuizChapters.genericChapterIds
import com.tito.camp22quiz.databinding.FragmentSearchBinding
import com.tito.camp22quiz.model.StudySearchBaseFragment
import com.tito.camp22quiz.ui.fragments.adapters.SearchResultRecyclerAdapter
import com.tito.camp22quiz.ui.fragments.misc_functions.MiscFunctions.doSearch


class SearchFragment:
    StudySearchBaseFragment<FragmentSearchBinding>(FragmentSearchBinding::inflate),
    SearchView.OnQueryTextListener {

    private val args: SearchFragmentArgs by navArgs()
    private var searchResults = doSearch("")
    private lateinit var rvSearchResults: RecyclerView
    private var searchQuery: String = ""
    private lateinit var origin: String


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        val miSearch = menu.findItem(R.id.mi_search)
        setUpMenuSearch(miSearch)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        origin = args.origin
        rvSearchResults = appCompatActivity.findViewById(R.id.rv_search_results)
    }

    override fun onResume() {
        super.onResume()
        sharedViewModel.version.observe(viewLifecycleOwner) {
            swapSearchResultsAdapter()
        }
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        newText?.let{
            searchQuery = it
            searchResults = if (origin == getString(R.string.verse_fragment)){
                doSearch(it, sharedViewModel.currentChapterPosition.value)
            }
            else{
                doSearch(it)
            }
            swapSearchResultsAdapter()
        }
        return false
    }

    private fun swapSearchResultsAdapter(){
        rvSearchResults.swapAdapter(
            SearchResultRecyclerAdapter(
                searchResults,
                sharedViewModel.version.value!!,
                searchQuery,
                origin
            ),
            true
        )
    }

    private val miSearchExpandListener = object: MenuItem.OnActionExpandListener{
        override fun onMenuItemActionExpand(item: MenuItem?): Boolean {
            return true
        }

        override fun onMenuItemActionCollapse(item: MenuItem?): Boolean {
            sharedViewModel.setCurrentQuery("")
            findNavController().navigateUp()
            return true
        }

    }

    private fun setUpMenuSearch(miSearch: MenuItem){
        miSearch.actionView = SearchView(appCompatActivity.supportActionBar!!.themedContext)
        miSearch.setOnActionExpandListener(miSearchExpandListener)

        val searchView = miSearch.actionView as SearchView
        searchView.setOnQueryTextListener(this)
//        searchView.queryHint = Html.fromHtml("<font color = #ffffff>ole</font><font color = yellow> YCEE</font>", Html.FROM_HTML_MODE_LEGACY )
        searchView.queryHint =
            if(origin == getString(R.string.verse_fragment))
                "Search Gen ${chapterNumbers[sharedViewModel.currentChapterPosition.value!!]}"
            else
                "Search all chapters"
        miSearch.expandActionView()
        sharedViewModel.currentQuery.value!!.let{
            if(it.isNotBlank())
                searchView.setQuery(it, false)
        }
    }
}