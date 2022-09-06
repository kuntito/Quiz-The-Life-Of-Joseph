package com.tito.camp22quiz.ui.fragments.adapters

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tito.camp22quiz.model.Question
import com.tito.camp22quiz.model.questions_per_set
import com.tito.camp22quiz.ui.fragments.QuestionFragment
import com.tito.camp22quiz.ui.fragments.QuizFragment

class QuizQuestionAdapter(quizFragment: QuizFragment, private val questionList: List<Question>): FragmentStateAdapter(quizFragment) {

    override fun getItemCount(): Int {
        return questions_per_set
    }

    override fun createFragment(position: Int): Fragment {
        val questionFragment = QuestionFragment()
        questionFragment.position = position
        return questionFragment
    }
}