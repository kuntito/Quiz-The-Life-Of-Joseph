package com.tito.camp22quiz.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.tito.camp22quiz.R
import com.tito.camp22quiz.databinding.FragmentQuizBinding
import com.tito.camp22quiz.model.QuizBaseFragment
import com.tito.camp22quiz.model.questions_per_set
import com.tito.camp22quiz.ui.fragments.adapters.QuizQuestionAdapter


class QuizFragment : QuizBaseFragment<FragmentQuizBinding>(FragmentQuizBinding::inflate) {
    private var currentQuestionIndex: Int = 0
    private val lastQuestionIndex = questions_per_set - 1
    private var viewCreated = false
    private val args: QuizFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        when(args.origin){
            getString(R.string.homescreen) -> {
                currentQuestionIndex = if(!quizViewModel.quizStarted.value!!) 0 else
                    quizViewModel.currentQuestionPosition.value!!
            }
            getString(R.string.question_grid_fragment) -> {
                // if question is selected from question grid
                args.selectedQuestion.let {
                    if(it != -1) currentQuestionIndex = it
                }
            }
        }


        setQuizNavigationButtons(currentQuestionIndex)
        viewCreated = true
        binding.apply{
            setupViewPager(vp2Question)
            btnNextSubmit.setOnClickListener(btnNextSubmitListener)
            btnPrevious.setOnClickListener {vp2Question.setCurrentItem(currentQuestionIndex - 1, true)}
            ivQuestionGrid.setOnClickListener {findNavController().navigate(R.id.action_quizFragment_to_questionGridFragment)}
        }
    }


    private fun setupViewPager(viewPager: ViewPager2){
        viewPager.adapter = QuizQuestionAdapter(this@QuizFragment, quizViewModel.questionSet)
//        viewPager.isUserInputEnabled = false
        viewPager.setCurrentItem(currentQuestionIndex, false)
        viewPager.registerOnPageChangeCallback(onPageChangeCallback)
    }

    private val onPageChangeCallback = object: ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            currentQuestionIndex = position
            if(viewCreated){
                setQuizNavigationButtons(currentQuestionIndex)
            }
        }
    }


    private fun setQuizNavigationButtons(questionIndex: Int){
        binding.apply {
            when (questionIndex) {
                0 -> {
                    btnNextSubmit.text = getString(R.string.next)
                    btnPrevious.visibility = View.GONE
                    btnNextSubmit.backgroundTintList = btnPrevious.backgroundTintList
                }
                in 1 until lastQuestionIndex -> {
                    btnPrevious.visibility = View.VISIBLE

                    btnNextSubmit.text = getString(R.string.next)
                    btnNextSubmit.backgroundTintList = btnPrevious.backgroundTintList
                }
                lastQuestionIndex -> {
                    btnPrevious.visibility = View.VISIBLE
                    btnNextSubmit.text = getString(R.string.submit)
                    btnNextSubmit.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.burnished_brown)
                }
            }
        }
    }

    private val btnNextSubmitListener = View.OnClickListener {
        with(binding.btnNextSubmit){
            when(text){
                getString(R.string.next) -> binding.vp2Question.setCurrentItem(currentQuestionIndex + 1, true)
                getString(R.string.submit) -> {
                    showDialog()
                }
            }
        }
    }

    private fun showDialog(){
        MaterialAlertDialogBuilder(requireContext(), R.style.customDialogStyle)
            .setTitle(getString(R.string.submit_this_quiz))
            .setMessage(if(isAllQuestionsAnswered()) "" else getString(R.string.there_are_unanswered_questions))
            .setCancelable(true)
            .setNeutralButton(
                getString(R.string.cancel)){ _, _ ->
            }.setPositiveButton(
                getString(R.string.submit_quiz)){ _, _ ->
                currentQuestionIndex = 0
                quizViewModel.setQuizStarted(false)
                findNavController().navigate(R.id.action_quizFragment_to_quizReviewFragment)
            }
            .show()
    }

    private fun isAllQuestionsAnswered(): Boolean{
        for(question in quizViewModel.questionSet){
            if(question.selectedAnswer == null) return false
        }
        return true
    }

    override fun onDestroyView() {
        quizViewModel.setCurrentChapterPosition(currentQuestionIndex)
        super.onDestroyView()
    }
}