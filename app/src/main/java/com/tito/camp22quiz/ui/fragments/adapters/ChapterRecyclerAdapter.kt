package com.tito.camp22quiz.ui.fragments.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.tito.camp22quiz.data.QuizChapters.chapterCount
import com.tito.camp22quiz.data.QuizChapters.genericChapterIds
import com.tito.camp22quiz.databinding.ChapterViewBinding
import com.tito.camp22quiz.ui.fragments.StudyFragmentDirections

class ChapterRecyclerAdapter: AdapterBaseClass<ChapterViewBinding>(ChapterViewBinding::inflate){

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            val currentChapterId = genericChapterIds[position]
            btnChapterView.text = currentChapterId
            btnChapterView.setOnClickListener {
                val action = StudyFragmentDirections.actionStudyFragmentToVersesFragment(position)
                Navigation.findNavController(it).navigate(action)
            }
        }
    }

    override fun getItemCount(): Int {
        return chapterCount
    }
}