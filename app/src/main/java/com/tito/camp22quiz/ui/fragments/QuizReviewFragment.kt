package com.tito.camp22quiz.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.tito.camp22quiz.R
import com.tito.camp22quiz.databinding.FragmentQuizReviewBinding
import com.tito.camp22quiz.model.QuizBaseFragment
import com.tito.camp22quiz.model.questions_per_set
import com.tito.camp22quiz.ui.fragments.adapters.QuizReviewAdapter


class QuizReviewFragment : QuizBaseFragment<FragmentQuizReviewBinding>(FragmentQuizReviewBinding::inflate) {
    private var quizScore = 0
    private var newQuestionsSet = false
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner

        calculateQuizScore()
        binding.apply {
            tvQuizScore.text = getString(R.string.quiz_result, quizScore, questions_per_set)
            setupRecyclerView(rvReviewedQuestions)
            btnAnotherQuiz.setOnClickListener {
                quizViewModel.setNewQuestions()
                newQuestionsSet = true
                findNavController().navigate(R.id.action_quizReviewFragment_to_quizFragment)
            }
        }
    }

    private fun setupRecyclerView(rv: RecyclerView){
        val itemDecorator = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        itemDecorator.setDrawable(
            ContextCompat.getDrawable(requireContext(), R.drawable.recycler_divider)!!
        )
        rv.addItemDecoration(itemDecorator)
        rv.adapter = QuizReviewAdapter(quizViewModel.questionSet)
    }

    private fun calculateQuizScore(){
        for(question in quizViewModel.questionSet){
            question.selectedAnswer?.let{
                if (it == question.questionAnswer.answer) quizScore += 1
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (!newQuestionsSet)
            quizViewModel.setNewQuestions()
    }
}