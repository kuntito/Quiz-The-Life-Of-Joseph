package com.tito.camp22quiz.ui.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.tito.camp22quiz.R
import com.tito.camp22quiz.databinding.FragmentHomeScreenBinding
import com.tito.camp22quiz.model.BaseFragment
import com.tito.camp22quiz.model.QuizViewModel

class HomeScreenFragment : BaseFragment<FragmentHomeScreenBinding>(FragmentHomeScreenBinding::inflate) {
    private val quizViewModel: QuizViewModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            homeScreenFragment = this@HomeScreenFragment
            quizViewModel.quizStarted.observe(viewLifecycleOwner){
                btnTakeQuiz.text = if(it) getString(R.string.resume_quiz) else getString(R.string.take_quiz)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.homescreen_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.mi_info -> {
                showInfoDialog()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showInfoDialog(){
        MaterialAlertDialogBuilder(requireContext(), R.style.customDialogStyle)
            .setTitle(getString(R.string.about_app))
            .setMessage(getString(R.string.app_information))
            .setCancelable(true)
            .show()
    }

    fun goToQuizFragment(){
        val action = HomeScreenFragmentDirections.actionHomeScreenFragmentToQuizFragment(origin = getString(
            R.string.homescreen))
        findNavController().navigate(action)
    }
    fun goToStudyFragment(){
        findNavController().navigate(R.id.action_homeScreenFragment_to_studyFragment)
    }
    //TODO the app should remember the version chosen after it's been closed
    //TODO search icon
}