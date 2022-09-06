package com.tito.camp22quiz.ui.fragments.adapters

import android.view.View
import androidx.navigation.Navigation
import com.tito.camp22quiz.R
import com.tito.camp22quiz.databinding.QuestionGridItemBinding
import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.ui.fragments.QuestionGridFragmentDirections

class QuizGridAdapter(private val questions: List<Question>): AdapterBaseClass<QuestionGridItemBinding>(QuestionGridItemBinding::inflate) {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mQuestion = questions[position]
        holder.binding.apply{
            ivUnansweredQuestion.visibility = if (mQuestion.selectedAnswer == null) View.VISIBLE else View.GONE
            tvQuestionGridItem.apply {
                text = "Q${position + 1}"
            }
            cvQuestionGridItem.apply {
                setOnClickListener {
                    val action = QuestionGridFragmentDirections.actionQuestionGridFragmentToQuizFragment(position,context.getString(
                                            R.string.question_grid_fragment))
                    Navigation.findNavController(it).navigate(action)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return questions.size
    }
}