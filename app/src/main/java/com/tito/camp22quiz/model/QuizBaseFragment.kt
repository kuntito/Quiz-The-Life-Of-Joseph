package com.tito.camp22quiz.model

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.tito.camp22quiz.R
import com.tito.camp22quiz.ui.fragments.global_navigation.GlobalNavigation.goToSearchFragment

abstract class QuizBaseFragment<VB: ViewBinding>(
    private val inflate: Inflate<VB>
): Fragment() {

    val quizViewModel: QuizViewModel by activityViewModels()
    val appCompatActivity
        get() = activity as AppCompatActivity


    private var _binding: VB? = null
    val binding
        get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate.invoke(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}