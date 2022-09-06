package com.tito.camp22quiz.ui.fragments

import android.os.Bundle
import android.view.View
import com.google.android.flexbox.*
import com.tito.camp22quiz.databinding.FragmentQuestionGridBinding
import com.tito.camp22quiz.model.QuizBaseFragment
import com.tito.camp22quiz.ui.fragments.adapters.QuizGridAdapter

class QuestionGridFragment : QuizBaseFragment<FragmentQuestionGridBinding>(FragmentQuestionGridBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val flexboxLayoutManager = FlexboxLayoutManager(context).apply {
            justifyContent = JustifyContent.SPACE_EVENLY
            alignItems = AlignItems.CENTER
            flexDirection = FlexDirection.ROW
            flexWrap = FlexWrap.WRAP
        }
        binding.apply{
            rvQuestionGrid.adapter = QuizGridAdapter(quizViewModel.questionSet)
            rvQuestionGrid.layoutManager = flexboxLayoutManager
        }
    }
}