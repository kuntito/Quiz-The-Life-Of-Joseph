package com.tito.camp22quiz.ui.fragments.adapters

import android.util.Log
import androidx.navigation.Navigation
import com.tito.camp22quiz.R
import com.tito.camp22quiz.data.QuizChapters.chapterNumbers
import com.tito.camp22quiz.databinding.SearchResultItemViewBinding
import com.tito.camp22quiz.model.BibleVersion
import com.tito.camp22quiz.model.Verse
import com.tito.camp22quiz.ui.fragments.SearchFragmentDirections

class SearchResultRecyclerAdapter(
    private val dataSet: List<List<Verse>>,
    private val bibleVersion: BibleVersion,
    private val query: String,
    private val origin: String
): AdapterBaseClass<SearchResultItemViewBinding>(SearchResultItemViewBinding::inflate){
    private var  currentDataSet = dataSet[bibleVersion.id]

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val verse = currentDataSet[position]
        holder.binding.apply {
            tvVerseIdSearchResult.apply {
                text = this.context.getString(
                    R.string.search_result_verse_id,
                    verse.chapterNumber,
                    verse.number,
                    bibleVersion.versionName
                )
            }
            tvVerseSearchResult.text = verse.colouredText

            if (verse.number > 0 && origin != "verse fragment"){
                llSearchResult.setOnClickListener {
                    val chapterPosition = chapterNumbers.indexOf(verse.chapterNumber)
                    val origin = "search fragment"
                    val action = SearchFragmentDirections.actionSearchFragmentToVersesParentFragment(
                        chapterPosition,
                        origin,
                        query,
                        verse.number - 1
                    )
                    Navigation.findNavController(it).navigate(action)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return currentDataSet.size
    }
}