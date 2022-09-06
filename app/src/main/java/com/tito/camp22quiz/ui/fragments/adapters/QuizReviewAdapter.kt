package com.tito.camp22quiz.ui.fragments.adapters

import android.content.Context
import android.util.Log
import android.view.View
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.tito.camp22quiz.R
import com.tito.camp22quiz.databinding.QuizReviewItemBinding
import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.Verse

class QuizReviewAdapter(private val questions: List<Question>): AdapterBaseClass<QuizReviewItemBinding>(QuizReviewItemBinding::inflate){
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentQuestion = questions[position]
        val context = holder.binding.ivCorrectWrong.context
        holder.binding.apply {
            tvQuestionDecor.text = context.getString(R.string.question_n, position+1)
            tvQuestionR.text = currentQuestion.question

            val answerFormat = context.getString(
                R.string.quiz_review_answer_format,
                currentQuestion.questionAnswer.answer,
                currentQuestion.questionAnswer.chapter_number,
                currentQuestion.questionAnswer.verse_s
            )
            tvCorrectAnswer.text = answerFormat

            val iconCorrectWrongId: Int
            if (currentQuestion.userCorrect){
                iconCorrectWrongId = R.drawable.ic_correct_option
                llUserChoice.visibility = View.GONE
            }else{
                iconCorrectWrongId = R.drawable.ic_wrong_option
                llUserChoice.visibility = View.VISIBLE
                currentQuestion.selectedAnswer?.let{
                    tvUserChoice.text = it
                }
            }

            ivCorrectWrong.setImageResource(iconCorrectWrongId)
            llCorrectAnswer.setOnClickListener {
                showVerseReferenceDialog(context, answerFormat.split(" - ")[1], currentQuestion.questionAnswer.references)
            }
        }
    }

    private fun showVerseReferenceDialog(context: Context, verseId: String, listVerses: List<Verse>){
        val message = listVerses.joinToString("\n\n") { "${it.number}. ${it.text}" }
        MaterialAlertDialogBuilder(context, R.style.customDialogStyle)
            .setTitle(verseId)
            .setMessage(message)
            .setCancelable(true)
            .show()
    }

    override fun getItemCount(): Int {
        return questions.size
    }
}