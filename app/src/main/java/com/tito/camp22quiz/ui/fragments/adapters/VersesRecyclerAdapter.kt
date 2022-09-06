package com.tito.camp22quiz.ui.fragments.adapters

import com.tito.camp22quiz.R
import com.tito.camp22quiz.data.QuizChapters.getChapter
import com.tito.camp22quiz.databinding.VerseViewBinding

class VersesRecyclerAdapter(
    val currentChapterPosition: Int,
    val version: String
): AdapterBaseClass<VerseViewBinding>(VerseViewBinding::inflate) {
    private val chapter = getChapter(currentChapterPosition, version)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            val verse = chapter.verses[position]

/*
            tvVerseTitle.apply {
                text = this.context.getString(
                    R.string.search_result_verse_id,
                    verse.chapterNumber,
                    verse.number,
                    verse.versionName
                )
            }
            tvVerseText.text =
                verse.text
*/
            tvVerseText.also {
                it.text = it.context.getString(
                    R.string.verses_format,
                    verse.number,
                    verse.text
                )
            }
        }
    }

    override fun getItemCount(): Int {
        return chapter.versesCount
    }
}