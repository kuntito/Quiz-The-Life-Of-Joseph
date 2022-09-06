package com.tito.camp22quiz.ui.fragments.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tito.camp22quiz.data.QuizChapters.chapterCount
import com.tito.camp22quiz.ui.fragments.VersesParentFragment
import com.tito.camp22quiz.ui.fragments.VersesChildFragment

/*
class ChapterViewPagerAdapter(
    private val versionAtClassInstantiation: String
): RecyclerView.Adapter<ChapterViewPagerAdapter
.RecyclerViewHolder>() {
    class RecyclerViewHolder(val binding: RvVersesViewBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RvVersesViewBinding.inflate(inflater, parent, false)
        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.binding.rvVerses.adapter = VersesRecyclerAdapter(position, versionAtClassInstantiation)
    }

    override fun getItemCount(): Int {
        return chapterCount
    }
}*/

class ChapterViewPagerAdapter(versesParentFragment: VersesParentFragment, private val versePosition: Int? = null): FragmentStateAdapter(versesParentFragment){
    override fun getItemCount(): Int {
        return chapterCount
    }

    override fun createFragment(position: Int): Fragment {
        return VersesChildFragment(versePosition)
    }
}