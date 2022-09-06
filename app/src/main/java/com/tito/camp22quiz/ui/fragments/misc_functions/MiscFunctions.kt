package com.tito.camp22quiz.ui.fragments.misc_functions

import android.content.Context
import android.text.Html
import android.text.Spanned
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import com.tito.camp22quiz.R
import com.tito.camp22quiz.data.BibleVersions
import com.tito.camp22quiz.data.QuizChapters.allVersions
import com.tito.camp22quiz.data.quiz_chapters.Gen0
import com.tito.camp22quiz.model.Chapter
import com.tito.camp22quiz.model.Verse

object MiscFunctions {
    private fun getRegexBibleVersion(): Regex{
        //creates a group of bible versions separated by vertical bars (|)
        val patternGroup = BibleVersions.selectedBibleVersions.joinToString("|"){"\\(${it.versionName}\\)"}
        val regexPattern = "($patternGroup)"
        return Regex(regexPattern, RegexOption.IGNORE_CASE)
    }

    fun removeVersionFromString(someString: String): String{
        //this essentially removes any String that matches bible version names in parentheses
        val delimiter = " "
        val result = mutableListOf<String>()
        val regexPattern = getRegexBibleVersion()

        for (part in someString.split(delimiter)){
            if(!part.matches(regexPattern)) result.add(part)
        }
        return result.joinToString(delimiter)
    }

    fun initializeSearchMenuItem(activity: AppCompatActivity, menu: Menu, expandView: Boolean, globalSearch: Boolean){
        val miSearch = menu.findItem(R.id.mi_search)
        val context = activity.supportActionBar!!.themedContext

        miSearch.actionView = SearchView(context)
        val searchView = miSearch.actionView as SearchView

        if(expandView){
            miSearch.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
            searchView.isIconified = false
        }
    }

    fun hideSoftKeyboard(activity: AppCompatActivity){
        val inputManager: InputMethodManager = activity
            .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        //check if no view has focus:
        val v: View = activity.currentFocus ?: return

        inputManager.hideSoftInputFromWindow(v.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
    }

    fun doSearch(query: String, chapterToSearchPosition: Int? = null): List<List<Verse>>{
        val dataSet = mutableListOf<List<Verse>>()

        if (query.isNotBlank()){
            dataSet.addAll(
                searchChapters(query, chapterToSearchPosition)
            )
        }

        return  if (dataSet.flatten().isNotEmpty())
                    dataSet.toList()
                else listOf(
                    Gen0.verses,
                    Gen0.verses
                )
    }


    /**
     * functions searches all chapters if chapterToSearchPosition is null
     */
    private fun searchChapters(query: String, chapterToSearchPosition: Int? = null): List<List<Verse>>{
        val versionsToSearch = getVersionsToSearch(chapterToSearchPosition)
        val dataSet = mutableListOf<List<Verse>>()
        val dataSubset = mutableListOf<Verse>()

        for(version in versionsToSearch){
            for (chapter in version){
                dataSubset.addAll(
                    searchVerses(query, chapter)
                )
            }
            dataSet.add(dataSubset.toList())
            dataSubset.clear()
        }
        return dataSet
    }

    private fun getVersionsToSearch(chapterToSearchPosition: Int?): List<List<Chapter>>{
        chapterToSearchPosition?.let{
            return allVersions.map{
                listOf(it[chapterToSearchPosition])
            }
        }
        return allVersions
    }


    private fun searchVerses(query:String, chapter: Chapter): List<Verse>{
        val versesFound = mutableListOf<Verse>()
        for (verse in chapter.verses){
            if (query.lowercase() in verse.text.lowercase()){
                verse.colouredText = colorQueryInText(query, verse.text)
                versesFound.add(verse)
            }
        }
        return versesFound
    }

    private fun colorQueryInText(query: String, text: String): Spanned {
        return Html.fromHtml(
            text.split(query, ignoreCase = true)
                .joinToString("<font color=yellow>$query</font>"){
                    "<font color=white>$it</font>"
                }
        )
    }


}