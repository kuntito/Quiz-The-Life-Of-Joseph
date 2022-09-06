package com.tito.camp22quiz.ui.fragments

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.tito.camp22quiz.R
import com.tito.camp22quiz.data.QuizChapters
import com.tito.camp22quiz.databinding.FragmentVersesParentBinding
import com.tito.camp22quiz.model.StudySearchBaseFragment
import com.tito.camp22quiz.ui.fragments.adapters.ChapterViewPagerAdapter
import com.tito.camp22quiz.ui.fragments.misc_functions.MiscFunctions.initializeSearchMenuItem
import com.tito.camp22quiz.ui.fragments.page_transformers.CustomPageTransformer

class VersesParentFragment : StudySearchBaseFragment<FragmentVersesParentBinding>(FragmentVersesParentBinding::inflate) {
    private val args: VersesParentFragmentArgs by navArgs()
    var rvVerses: RecyclerView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedViewModel.setCurrentChapterPosition(args.chapterPosition)
        val versesViewPager = binding.vp2Verses
        val startingChapterPosition = args.chapterPosition
        val destinationOrigin = args.origin
        val versePositionQueryResult = args.versePositonQueryResult
        val searchQuery = args.query
        if (searchQuery.isNotBlank()) sharedViewModel.setCurrentQuery(searchQuery)

        val onPageChangeCallback = object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                sharedViewModel.setCurrentChapterPosition(position)
                setActionBarTitle(
                    QuizChapters.getChapter(
                        sharedViewModel.currentChapterPosition.value!!,
                        sharedViewModel.version.value?.versionName!!
                    ).id
                )
            }
        }


        versesViewPager.adapter = ChapterViewPagerAdapter(this, versePositionQueryResult)
        versesViewPager.setPageTransformer(CustomPageTransformer)
        versesViewPager.registerOnPageChangeCallback(onPageChangeCallback)
        versesViewPager.setCurrentItem(startingChapterPosition, false)
        if(destinationOrigin == "search fragment") versesViewPager.isUserInputEnabled = false
    }


/*
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        initializeSearchMenuItem(appCompatActivity, menu, expandView = false, globalSearch = false)
    }
*/

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.mi_search -> {
                val action = VersesParentFragmentDirections.actionGlobalSearchFragment(getString(R.string.verse_fragment))
                findNavController().navigate(action)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}