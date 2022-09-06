package com.tito.camp22quiz.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import androidx.navigation.fragment.findNavController
import com.tito.camp22quiz.R
import com.tito.camp22quiz.databinding.FragmentQuestionBinding
import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.QuizBaseFragment
import com.tito.camp22quiz.model.questions_per_set

//TODO BaseFragment should only contain the binding class requirements
class QuestionFragment : QuizBaseFragment<FragmentQuestionBinding>(FragmentQuestionBinding::inflate){
    private lateinit var rbOptions: List<RadioButton>
    private lateinit var question: Question
    var position = 0


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        question = quizViewModel.questionSet[position]
        binding.apply {
            tvQuestionCount.text = getString(R.string.question_count, position+1, questions_per_set)
            tvQuestion.text = question.question
            rbOptions = listOf(rbOption1, rbOption2, rbOption3, rbOption4)
            question.selectedOptionId?.let {
                rgOptions.check(it)
            }
            rgOptions.setOnCheckedChangeListener { _, checkedId ->
                //quiz is said to have started when an option has been selected
                quizViewModel.setQuizStarted(true)
                question.selectedOptionId = checkedId
                question.selectedAnswer = rbOptions.find{it.id == checkedId}!!.text.toString()
            }
            tvQuestionId.text = question.id.toString()
        }
        setUpOptions()
    }

    private fun setUpOptions(){
        rbOptions.zip(question.options).forEach{
            it.first.text = it.second
        }
    }
}